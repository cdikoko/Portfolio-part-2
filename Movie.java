
package moviemanager;

public class Movie extends MediaItem {

    private String mediaType;
    
    public Movie(String t, String y, String m) {
        setTitle(t);
        setYear(y);
        setMediaType(m);
    }
    
    @Override
    public void setMediaType(String mt) {
        mediaType = mt;
    }
    
    @Override
    public String getMediaType() {
        return mediaType;
    }
}
