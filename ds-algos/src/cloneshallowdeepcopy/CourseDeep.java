package cloneshallowdeepcopy;

public class CourseDeep implements  Cloneable{
    int courseId;
    String courseName;

    public CourseDeep(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
