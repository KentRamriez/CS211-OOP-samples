package Artist;

public class Dancer extends Artist {
    public enum DanceStyle {
        BALLET, HIP_HOP, JAZZ, CONTEMPORARY
    }

    private DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle danceStyle) {
        super(name, age, "Dance");
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" +
               "Dance Style: " + danceStyle;
    }
}