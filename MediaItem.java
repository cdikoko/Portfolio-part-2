
package moviemanager;

public abstract class MediaItem implements Comparable<MediaItem> {
    
    private String title;
    private String year;
    private String artist;
    private String media;
    
    public void setTitle(String t) {
        title = t;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setYear(String y) {
        year = y;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setArtist(String a) {
        artist = a;
    }
    
    public String getArtist() {
        return artist;
    }
    
    public void setMediaType(String m) {
        media = m;
    }
    
    public String getMediaType() {
        return media;
    }
    
    @Override
    public int compareTo(MediaItem other) {
        if(other.getClass().equals(Album.class)) {
            int artistComp = getArtist().compareTo(other.getArtist());
            if(artistComp != 0) {
                return artistComp;
            }
            
            int yearComp = getYear().compareTo(other.getYear());
            if(yearComp != 0) {
                return yearComp;
            }
            
            return getTitle().compareTo(other.getTitle());
        }
        else {
            int titleComp = getTitle().compareTo(other.getTitle());
            if(titleComp != 0) {
                return titleComp;
            }
            
            int yearComp = getYear().compareTo(other.getYear());
            if(yearComp != 0) {
                return yearComp;
            }
            
            return getMediaType().compareTo(other.getMediaType());
        }
    }
}
