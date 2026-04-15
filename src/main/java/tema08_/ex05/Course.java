package tema08_.ex05;

//Exercițiul 5 – Constructor + Moștenire
//Creează:
//- Course → private courseName, duration + constructor
//- OnlineCourse extinde Course → atribut platform
//- creează obiect și afișează datele

public class Course {
    private String courseName;
    private int duration;


    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getDuration(){
        return duration;
    }
}
