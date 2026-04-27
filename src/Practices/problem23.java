package Practices;
//Write a Java program to create a class called "Course"
// with attributes for course name, instructor, and credits.
// Create a subclass "OnlineCourse" that adds attributes for platform and duration.
// Implement methods to display course details and check if the course is eligible for a
// certificate based on duration.

class Course{
    private String courseName;
    private String instructor;
    private double credits;
    public Course(String courseName, String instructor, double credits){
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
class OnlineCourse extends Course{
    String platform;
    int duration;

    public OnlineCourse(String courseName, String instructor, double credits,String platform,int duration){
        super(courseName,instructor,credits);
        this.platform = platform;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void displayCourseDetails(){
        System.out.println("Course Name: "+getCourseName());
        System.out.println("Instructor: "+getInstructor());
        System.out.println("Credit: "+getCredits());
        System.out.println("Platform: "+platform);
        System.out.println("Duration: "+duration);
    }
    public boolean isCertificateEligible(){
        if(duration >= 10){
            return true;
        }else{
            return false;
        }
    }
}
public class problem23 {
    public static void main(String[] args) {
        OnlineCourse oop = new OnlineCourse("Object Oriented Programming","Fayjullah",3.0,"Youtube",13);
        oop.displayCourseDetails();
        System.out.println("Is eligible for certificate? "+oop.isCertificateEligible());
    }
}
