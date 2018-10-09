package f18comp1008oct9;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class Professor {
    //Create instance variables-> make sure they are private
    //so only the Professor class can update it
    private String fullName, email;
    private double salary;
    private ArrayList<String> teachableCourses;

    /**
     * The constructor will initialize all of the instance variables
     */
    public Professor(String fullName, String email, double salary) {
        setFullName(fullName);
        setEmail(email);
        setSalary(salary);
        teachableCourses = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    /**
     * This method will validate that the name is not empty and
     * set the instance variable
     * @param fullName -> Professor's first and last name as 1 String
     */
    public void setFullName(String fullName) {
        if (!fullName.isEmpty())
            this.fullName = fullName;
        else
            throw new IllegalArgumentException("Name cannot be empty");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * This reflects the Professor's annual salary and must be greater than 
     * 0
     * @param salary 
     */
    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            throw new IllegalArgumentException("Salary must be greater than 0");
    }

    public ArrayList<String> getTeachableCourses() {
        return teachableCourses;
    }
    
    
    public ArrayList<String> getTeachableSubjects() {
        return teachableCourses;
    }

    public void setTeachableCourses(ArrayList<String> teachableCourses) {
        this.teachableCourses = teachableCourses;
    }
    
    /**
     * This accepts a String that represents a course code and adds
     * it as a "teachable subject" to the Professor
     */
    public void addCourseToTeachableSubjects(String courseCode)
    {
        teachableCourses.add(courseCode);
    }
    
    
    /**
     * This method validates if the Professor can teach a subject
     * that is passed in as a String.  The String represents the course
     * code
     */
    public boolean canTeachSubject(String courseToTeach)
    {
        return teachableCourses.contains(courseToTeach);
    }
    
    /**
     * This method will return a String to describe the Professor
     */
    public String toString()
    {
        return String.format("%s teaches %d courses and earns $%.2f salary",
                fullName, teachableCourses.size(), salary);
    }
  
    
}
