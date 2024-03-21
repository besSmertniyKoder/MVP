package TaskOnLesson.data;

public class Student extends  User{
    private String direction;

    public Student() {
    }

    public Student(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }
}
