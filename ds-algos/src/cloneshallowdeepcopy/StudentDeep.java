package cloneshallowdeepcopy;

public class StudentDeep implements Cloneable {

    int id;
    String name;

    CourseDeep courseDeep;

    public StudentDeep(int id, String name, CourseDeep courseDeep) {
        this.id = id;
        this.name = name;
        this.courseDeep = courseDeep;
    }

    //Overriding clone() method to create a deep copy of an object.
    //If we remove implements Cloneable and this method clonning won't happend.
    // which mean duplicate copy won't be generated
    protected Object clone() throws CloneNotSupportedException {
        StudentDeep copy = (StudentDeep) super.clone();
        copy.courseDeep = (CourseDeep) courseDeep.clone();
        return copy;
    }
}
