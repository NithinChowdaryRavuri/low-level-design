package cricinfo;

import java.util.ArrayList;
import java.util.List;

public class Innings {
    private final String id;
    private final String battingTeamId;
    private final String bowlingTeamId;
    private final List<Over> overs;

    public Innings(String id, String battingTeamId, String bowlingTeamId) {
        this.id = id;
        this.battingTeamId = battingTeamId;
        this.bowlingTeamId = bowlingTeamId;
        this.overs = new ArrayList<>();
    }

    public void addOver(Over over) {
        overs.add(over);
    }

    public String getId() {
        return id;
    }

    public String getBattingTeamId() {
        return battingTeamId;
    }

    public String getBowlingTeamId() {
        return bowlingTeamId;
    }

    public List<Over> getOvers() {
        return overs;
    }
}
