package f18comp1008oct9;

import java.util.ArrayList;

/**
 *
 * @author jwright
 */
public class F18COMP1008Oct9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //type of object
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-10);
        numbers.add(-5);
        numbers.add(0);
        numbers.add(15);
        
        System.out.println("Before: " + numbers);
        System.out.println("After: "+ absoluteValue(numbers));
    }
    
    public static ArrayList<Integer> absoluteValue(ArrayList<Integer> arrayList)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer num:arrayList)
        {
            //convert to absolute value
            num = Math.abs(num);
            
            //add it to the new list
            newList.add(num);
        }
        return newList;
    }
}
