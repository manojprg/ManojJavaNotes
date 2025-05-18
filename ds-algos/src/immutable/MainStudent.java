package immutable;

public class MainStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student stu = new Student(1, "manoj", new Course(1, "science"));
        System.out.println("stu id " + stu.getId() + " name " + stu.getName() + " Course id " + stu.getCourse().getId() + " course name " + stu.getCourse().getName());
        Course c = stu.getCourse();
        c.setId(10);
        System.out.println("stu id " + stu.getId() + " name " + stu.getName() + " Course id " + stu.getCourse().getId() + " course name " + stu.getCourse().getName());
    }
}
