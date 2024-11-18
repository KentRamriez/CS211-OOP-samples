package Artist;

public class Singer extends Artist {
    public enum Genre {
        POP, ROCK, JAZZ, CLASSICAL
    }

    private Genre genre;

    public Singer(String name, int age, Genre genre) {
        super(name, age, "Music");
        this.genre = genre;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" +
               "Genre: " + genre;
    }
}