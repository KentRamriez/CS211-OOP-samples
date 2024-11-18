package Artist;

public class Artist {
    private String name;
    private int age;
    private String specialty;

    public Artist(String name, int age, String specialty) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String displayInfo() {
        return "Artist Name: " + name + "\n" +
               "Age: " + age + "\n" +
               "Specialty: " + specialty;
    }
}