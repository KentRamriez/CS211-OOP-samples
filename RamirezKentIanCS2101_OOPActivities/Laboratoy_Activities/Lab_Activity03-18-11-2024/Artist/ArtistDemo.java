package Artist;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist[] artists = new Artist[] {
            new Artist("Charlie Puth", 32, "Music"),
            new Singer("Nayeon Im", 29, Singer.Genre.POP),
            new Painter("Vincent Van Gogh", 37, Painter.Medium.OIL),
            new Writer("George Orwell", 46, Writer.WritingStyle.FICTION),
            new Dancer("Misty Copeland", 38, Dancer.DanceStyle.BALLET)
        };

        displayArtistsInfo(artists);
    }

    private static void displayArtistsInfo(Artist[] artists) {
        for (Artist artist : artists) {
            System.out.println(artist.displayInfo());
            System.out.println(); // Extra line for spacing
        }
    }
}