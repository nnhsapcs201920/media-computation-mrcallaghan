
import java.util.ArrayList;
/**
 * Notes on ArrayLists.
 *
 * @author mcallaghan
 * @version 7 January 2020
 */
public class ArrayListNotes
{
    public static void main(String[] args)
    {
        /*
         * The ArrrayList class is Java Generic.
         * 
         * * We have to specify the type of the elements in the list in angle brackets
         *      (e.g., < >) after every ArrayList identifier.
         *      
         * Primitives (e.g., int, double) are not classes and cannot be specified as the
         *      type of the elements in a Generic. Instead, we use the corresponding
         *      wrapper class (e.g., Integer, Double).
         */
        ArrayList<Integer> myList;
        myList = createRandomIntegerList(10,20);
        System.out.println(myList);
        removeEvens(myList);
        System.out.println(myList);
    }
    /**
     * Creates and returns an ArrayList of the specified number of Integers where
     *      each element is assigned a random value between 1 and the specified range.
     *      
     * @param size     the number of Integers to add to the list
     * @param range    the range of random values to assign to each element 
     * @return a reference to the newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random() * range) + 1;
            
            /*
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing:
             *      Primitive values are automatically converted to their corresponding
             *          wrapper class objects. However, type promotion does not occur.
             */
            list.add(value);
        }
        
        return list;
    }
    
    /**
     * Removes even numbers from the specified list
     * 
     * @param list  the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        /*
         * The size method returns the number of elements in the list.
         */
        for(int i = 0; i < list.size(); i++)
        {
            /*
             * The get method returns the value of the element at the specified index.
             */
            
            
                 /*
                 * The remove method deletes the element at the specified index from the list.
                 *  All subsequent elements are "shifted left".
                 */
        
        }
    }
    
    
    
    
}
