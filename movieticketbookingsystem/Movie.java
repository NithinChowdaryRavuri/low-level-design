package movieticketbookingsystem;

public class Movie {
    private final String id;
    private final String title;
    private final String description;
    private final int durationInMinutes;

    public Movie(String id, String title, String description, int durationInMinutes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.durationInMinutes = durationInMinutes;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }
}
