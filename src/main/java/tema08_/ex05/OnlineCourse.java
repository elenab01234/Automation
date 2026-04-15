package tema08_.ex05;

public class OnlineCourse extends Course{
    String platform;

    public OnlineCourse(String onlineCourseName, int onlineCourseDuration, String platform) {
        super(onlineCourseName, onlineCourseDuration);
        this.platform=platform;;
    }
}
