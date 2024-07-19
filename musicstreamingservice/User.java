package musicstreamingservice;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String id;
    private final String username;
    private final String password;
    private final List<PlayList> playlists;

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.playlists = new ArrayList<>();
    }

    public void addPlayList(PlayList playlist) {
        playlists.add(playlist);
    }

    public void removePlayList(PlayList playlist) {
        playlists.remove(playlist);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<PlayList> getPlaylists() {
        return playlists;
    }
}
