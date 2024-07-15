package linkedin;

import java.util.List;

public class User {
    private final String id;
    private final String name;
    private final String email;
    private final String password;
    private Profile profile;
    private final List<Connection> connections;
    private final List<Message> inbox;
    private final List<Message> outbox;

    public User(String id, String name, String email, String password, Profile profile, List<Connection> connections, List<Message> inbox, List<Message> outbox) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.connections = connections;
        this.inbox = inbox;
        this.outbox = outbox;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Profile getProfile() {
        return profile;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public List<Message> getOutbox() {
        return outbox;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
