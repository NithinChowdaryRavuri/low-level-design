package linkedin;

import java.sql.Timestamp;

public class Connection {
    private final User user;
    private final Timestamp connectionTime;

    public Connection(User user, Timestamp connectionTime) {
        this.user = user;
        this.connectionTime = connectionTime;
    }

    public User getUser() {
        return user;
    }

    public Timestamp getConnectionTime() {
        return connectionTime;
    }
}
