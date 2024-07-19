package musicstreamingservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MusicLibrary {
    private static MusicLibrary instance;
    private final Map<String, Song> songs;
    private final Map<String, Artist> artists;
    private final Map<String, Album> albums;

    private MusicLibrary() {
        songs = new ConcurrentHashMap<>();
        artists = new ConcurrentHashMap<>();
        albums = new ConcurrentHashMap<>();
    }

    public static synchronized MusicLibrary getInstance() {
        if (instance == null) {
            instance = new MusicLibrary();
        }
        return instance;
    }

    public void addSong(Song song) {
        songs.put(song.getId(), song);
    }

    public void addAlbum(Album album) {
        albums.put(album.getId(), album);
        for (Song song: album.getSongs()) {
            addSong(song);
        }
    }

    public void addArtist(Artist artist) {
        artists.put(artist.getId(), artist);
        for (Album album: artist.getAlbums()) {
            addAlbum(album);
        }
    }

    public Song getSong(String songId) {
        return songs.get(songId);
    }

    public Artist getArtist(String artistId) {
        return artists.get(artistId);
    }

    public Album getAlbum(String albumId) {
        return albums.get(albumId);
    }

    public List<Song> searchSongs(String query) {
        List<Song> matchingSongs = new ArrayList<>();
        for (Song song: songs.values()) {
            if (song.getTitle().toLowerCase().contains(query.toLowerCase()) || song.getArtist().toLowerCase().contains(query.toLowerCase()) || song.getAlbum().toLowerCase().contains(query.toLowerCase())) {
                matchingSongs.add(song);
            }
        }
        return matchingSongs;
    }
}
