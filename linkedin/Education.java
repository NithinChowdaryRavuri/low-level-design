package linkedin;

public class Education {
    private final String schoolName;
    private final String degree;
    private final String fieldOfStudy;
    private final String startDate;
    private final String endDate;

    public Education(String schoolName, String degree, String fieldOfStudy, String startDate, String endDate) {
        this.schoolName = schoolName;
        this.degree = degree;
        this.fieldOfStudy = fieldOfStudy;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDegree() {
        return degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
