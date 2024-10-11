import java.util.ArrayList;
import java.util.List;


public class Course {
    private String courseId;
    private String courseName;
    private String instructor;

    public Course(String courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getters and Setters
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
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
}

public class CourseController {
    private List<Course> courses;

    public CourseController() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public void removeCourse(String courseId) {
        courses.removeIf(course -> course.getCourseId().equals(courseId));
    }
}
public class LMS {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        // Add some courses
        courseController.addCourse(new Course("CS101", "Introduction to Computer Science", "Dr. Smith"));
        courseController.addCourse(new Course("MATH101", "Calculus I", "Prof. Johnson"));

        // List all courses
        for (Course course : courseController.getAllCourses()) {
            System.out.println("Course ID: " + course.getCourseId() + ", Course Name: " + course.getCourseName() + ", Instructor: " + course.getInstructor());
        }
    }
}
