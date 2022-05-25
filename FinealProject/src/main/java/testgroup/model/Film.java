package testgroup.model;

public class Film {
    private Integer id;
    private String title;
    private Integer year;
    private String genre;
    private boolean watched;

    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public Integer getId() {
        return this.id;
    }
    public String getTitle() {
        return this.title;
    }
    public Integer getYear() {
        return this.year;
    }
    public String getGenre() {
        return this.genre;
    }
    public boolean getWatched() { return this.watched;}

    //public String toString() {return this.title + " " + this.year;}

}
