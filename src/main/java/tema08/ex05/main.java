package tema08.ex05;

public class main {
    public static void main(String[] args) {
        Course course = new Course("MT testing", 6);
        OnlineCourse onlineCourse = new OnlineCourse("AT testing", 8);

        System.out.println("Course " + course.getCourseName() + " duration is " + course.getDuration());
        System.out.println("Course " + onlineCourse.getCourseName() + " duration is " + onlineCourse.getDuration());

    }
}