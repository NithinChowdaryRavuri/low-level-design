package musicstreamingservice;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private final String id;
    private final String name;
    private final User owner;
    private final List<Song> songs;

    public PlayList(String id, String name, User user) {
        this.id = id;
        this.name = name;
        this.owner = user;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }

    public void removeSong(Song song) {
        this.songs.remove(song);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
