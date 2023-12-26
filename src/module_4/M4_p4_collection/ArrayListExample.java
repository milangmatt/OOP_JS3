package module_4.M4_p4_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        // Example 1: Default Constructor
        // Creating an ArrayList with the default constructor
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        System.out.println("ArrayList 1: " + list1);

        // Example 2: Constructor with Initial Capacity
        // Creating an ArrayList with an initial capacity and adding elements using asList
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList 2: " + list2);

        // Example 3: Copy Constructor
        // Creating an ArrayList by copying elements from another ArrayList
        ArrayList<String> list3 = new ArrayList<>(list1);
        System.out.println("ArrayList 3 (Copy of ArrayList 1): " + list3);

        // Example 4: Methods
        // Adding an element to ArrayList 1
        list1.add("Grapes");
        System.out.println("ArrayList 1 after adding 'Grapes': " + list1);

        // Getting the size of ArrayList 2
        System.out.println("Size of ArrayList 2: " + list2.size());

        // Checking if ArrayList 3 is empty
        System.out.println("Is ArrayList 3 empty? " + list3.isEmpty());

        // Getting an element at a specific index in ArrayList 1
        String element = list1.get(2);
        System.out.println("Element at index 2 in ArrayList 1: " + element);

        // Setting an element at a specific index in ArrayList 1
        list1.set(1, "Pineapple");
        System.out.println("ArrayList 1 after setting element at index 1 to 'Pineapple': " + list1);

        // Removing an element from ArrayList 3
        list3.remove("Banana");
        System.out.println("ArrayList 3 after removing 'Banana': " + list3);

        // Example 5: toString()
        // Using toString() to represent ArrayList 2 as a string
        System.out.println("ArrayList 2 as a String: " + list2.toString());

        // Example 6: ensureCapacity()
        // Creating an ArrayList and using ensureCapacity() to adjust its capacity
        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println("Initial capacity of ArrayList 4: " + list4.size());
        ((ArrayList<Integer>) list4).ensureCapacity(10);
        System.out.println("Capacity of ArrayList 4 after ensuring capacity for 10 elements: " + list4.size() );

        // Example 7: trimToSize()
        // Trimming the capacity of ArrayList 2
        System.out.println("Capacity of ArrayList 2 before trimming: " +  list2.size());
        ((ArrayList<Integer>) list2).trimToSize();
        System.out.println("Capacity of ArrayList 2 after trimming: " + list2.size());
    }
}
