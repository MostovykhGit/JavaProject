package testgroup.model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "year")
    private Integer year;
    @Column(name = "genre")
    private String genre;
    @Column(name = "watched")
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
