package cloneshallowdeepcopy;

public class MainShallowCopy {

    public static void main(String[] args) {
        StudentShallow shallow = new StudentShallow(1, "manoj", new CourseShallowcopy(1, "course-1"));

        try {
            StudentShallow shallow1 = (StudentShallow) shallow.clone();
            System.out.println("shallow " + shallow.hashCode() + " shallow1 " + shallow1.hashCode());
            System.out.println("shallow.course  " + shallow.courseShallowcopy.hashCode() + " shallow1.course " + shallow1.courseShallowcopy.hashCode());

            System.out.println("shallow " + shallow.hashCode() + " shallow1 " + shallow1.hashCode() + " shallow1 id " + shallow1.id + "  shallow1 name "
                    + shallow1.name + " couse id " + shallow1.courseShallowcopy.courseId +
                    " course name " + shallow1.courseShallowcopy.courseName);
            shallow.courseShallowcopy.courseName = "course-2";
            shallow.id = 5;
            System.out.println("shallow1 id " + shallow1.id + "  shallow1 name "
                    + shallow1.name + " couse id " + shallow1.courseShallowcopy.courseId +
                    " course name " + shallow1.courseShallowcopy.courseName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
