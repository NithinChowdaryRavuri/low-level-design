package trafficsignalcontrolsystem;

import java.util.HashMap;
import java.util.Map;

public class TrafficController {
    private static final TrafficController instance = new TrafficController();
    private Map<String, Road> roads;

    public static synchronized TrafficController getInstance() {
        return instance;
    }

    private TrafficController() {
        roads = new HashMap<String, Road>();
    }

    public void addRoad(Road road) {
        roads.put(road.getId(), road);
    }

    public void removeRoad(Road road) {
        roads.remove(road.getId());
    }

    public void startTrafficControl() {
        for (Road road : roads.values()) {
            TrafficLight trafficLight = road.getTrafficLight();
            new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(trafficLight.getRedDuration());
                        trafficLight.changeSignal(TrafficSignal.GREEN);
                        Thread.sleep(trafficLight.getGreenDuration());
                        trafficLight.changeSignal(TrafficSignal.YELLOW);
                        Thread.sleep(trafficLight.getYellowDuration());
                        trafficLight.changeSignal(TrafficSignal.RED);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void handleEmergency(String roadId) {
        Road road = roads.get(roadId);
        if (road != null) {
            TrafficLight trafficLight = road.getTrafficLight();
            trafficLight.changeSignal(TrafficSignal.GREEN);
            // Perform emergency handling logic
            // ...
        }
    }
}
