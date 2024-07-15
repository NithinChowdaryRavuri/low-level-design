package linkedin;

import java.sql.Timestamp;

public class Message {
    private final String id;
    private final User sender;
    private final User receiver;
    private final String content;
    private final Timestamp timestamp;

    public Message(String id, User sender, User receiver, String content, Timestamp timestamp) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
