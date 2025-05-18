package immutable;

public class Student {

    private final int id;
    private final String name;
    private final Course course;


    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Course getCourse() throws CloneNotSupportedException {
        return (Course) course.clone();
    }
}
