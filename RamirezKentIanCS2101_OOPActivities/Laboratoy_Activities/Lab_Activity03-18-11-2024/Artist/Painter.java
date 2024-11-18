package Artist;

public class Painter extends Artist {
    public enum Medium {
        OIL, ACRYLIC, WATERCOLOR, CHARCOAL
    }

    private Medium medium;

    public Painter(String name, int age, Medium medium) {
        super(name, age, "Painting");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" +
               "Medium: " + medium;
    }
}