import java.io.Serializable;
import java.util.Date;

public class AlbumBean implements Serializable {
    private int id;
    private String artist;
    private String name;
    private Date release_date;
    private String sales;
    private String genre;

    public AlbumBean() {}

    public int getId(){
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public Date getReleaseDate() {
        return release_date;
    }

    public String getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
    public void setSales(String sales) {
        this.sales = sales;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}
