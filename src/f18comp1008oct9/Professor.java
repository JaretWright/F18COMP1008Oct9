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

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<String> getTeachableCourses() {
        return teachableCourses;
    }

    public void setTeachableCourses(ArrayList<String> teachableCourses) {
        this.teachableCourses = teachableCourses;
    }
    
    
    
  
    
}
