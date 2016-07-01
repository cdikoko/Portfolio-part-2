
package moviemanager;

public class Album extends MediaItem {

    private String artist;
    
    public Album(String a, String y, String t) {
        setArtist(a);
        setTitle(t);
        setYear(y);
    }
    
    @Override
    public void setArtist(String a) {
        artist = a;
    }
    
    @Override
    public String getArtist() {
        return artist;
    }
}
