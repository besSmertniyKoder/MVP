package TaskOnLesson.data;

public class Teacher extends User {
    private String discipline;

    public Teacher() {
    }

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }
}
