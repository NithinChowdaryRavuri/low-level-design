package linkedin;

public class Experience {
    private final String title;
    private final String company;
    private final String startDate;
    private final String endDate;
    private final String Description;

    public Experience(String title, String company, String startDate, String endDate, String Description) {
        this.title = title;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.Description = Description;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return Description;
    }
}
