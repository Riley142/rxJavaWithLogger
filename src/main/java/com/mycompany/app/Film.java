package com.mycompany.app;

public class Film {

    private String title;
    private String genre;
    private Integer releaseYear;

    public Film(String title, String genre, Integer releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }


    @Override
    public String toString() {
        StringBuilder filmStr = new StringBuilder();
        filmStr.append("Film {");
        filmStr.append("title = '");
        filmStr.append(title);
        filmStr.append("genre = '");
        filmStr.append(genre);
        filmStr.append("', ");
        filmStr.append("releaseYear = '");
        filmStr.append(releaseYear).toString();
        filmStr.append("'}");

        return filmStr.toString();
    }
}
