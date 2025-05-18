package cloneshallowdeepcopy;

public class MainDeepCopy {

    public static void main(String[] args) {
        StudentDeep deep = new StudentDeep(1, "manoj", new CourseDeep(1, "course-1"));

        try {
            StudentDeep deep1 = (StudentDeep) deep.clone();

            System.out.println("deep " + deep.hashCode() + " deep1 " + deep1.hashCode());
            System.out.println("deep.course  " + deep.courseDeep.hashCode() + " deep1.course " + deep1.courseDeep.hashCode());
            System.out.println("deep1 id " + deep1.id + "  deep1 name "
                    + deep1.name + " couse id " + deep1.courseDeep.courseId +
                    " course name " + deep1.courseDeep.courseName);
            deep.courseDeep.courseName = "course-2";
            deep.id = 5;
            System.out.println("deep1 id " + deep1.id + "  deep1 name "
                    + deep1.name + " couse id " + deep1.courseDeep.courseId +
                    " course name " + deep1.courseDeep.courseName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
