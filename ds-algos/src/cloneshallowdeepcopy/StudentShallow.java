package cloneshallowdeepcopy;

public class StudentShallow implements Cloneable{

    int id;
    String name;

    CourseShallowcopy courseShallowcopy;

    public StudentShallow(int id, String name, CourseShallowcopy courseShallowcopy) {
        this.id = id;
        this.name = name;
        this.courseShallowcopy = courseShallowcopy;
    }

    //Default version of clone() method. It creates shallow copy of an object.
    //If we remove implements Cloneable and this method clonning won't happend.
    // which mean duplicate copy won't be generated
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
