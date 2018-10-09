package f18comp1008oct9;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class Test1Version2 {
    public static void main(String[] args)
    {
        Professor prof1 = new Professor("Oscar the Grouch", "og@grump.com",51);
        Professor prof2 = new Professor("JW", "java@happy.com",5100);
        Professor prof3 = new Professor("Ron McDonald", "ron@dean.com",1000000);
        
        prof1.addCourseToTeachableSubjects("COMP1008");
        prof1.addCourseToTeachableSubjects("COMP1011");
        
        prof2.addCourseToTeachableSubjects("COMP2003");
        prof2.addCourseToTeachableSubjects("COMP1008");
        prof2.addCourseToTeachableSubjects("MGMT2003");
        
        prof3.addCourseToTeachableSubjects("BUSI1001");
        
        //create an ArrayList of Professor objects
        ArrayList<Professor> profs = new ArrayList<>();
        profs.add(prof1);
        profs.add(prof2);
        profs.add(prof3);

        for (Professor prof:profs)
        {
            System.out.println(prof);
        }
        
        //display the Professor with the highestSalary
        System.out.printf("The highest earning prof is:%n%s", getHighestPaid(profs));
    }
    
    public static Professor getHighestPaid(ArrayList<Professor> profs)
    {
        Professor highestEarner = profs.get(0);
        
        for (Professor prof : profs)
        {
            if (prof.getSalary() > highestEarner.getSalary())
                highestEarner=prof;
        }
        
        return highestEarner;
    }
}
