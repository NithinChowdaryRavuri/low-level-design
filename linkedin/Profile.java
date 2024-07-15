package linkedin;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String profilePicture;
    private String headline;
    private String summary;
    private final List<Experience> experiences;
    private final List<Education> educations;
    private final List<Skill> skills;

    public Profile(){
        experiences = new ArrayList<>();
        educations = new ArrayList<>();
        skills = new ArrayList<>();
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
