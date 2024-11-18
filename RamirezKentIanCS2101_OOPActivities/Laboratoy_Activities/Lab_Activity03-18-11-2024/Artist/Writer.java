package Artist;

public class Writer extends Artist {
    public enum WritingStyle {
        FICTION, NON_FICTION, POETRY, DRAMA
    }

    private WritingStyle writingStyle;

    public Writer(String name, int age, WritingStyle writingStyle) {
        super(name, age, "Writing");
        this.writingStyle = writingStyle;
    }

    public WritingStyle getWritingStyle() {
        return writingStyle;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + "\n" +
               "Writing Style: " + writingStyle;
    }
}