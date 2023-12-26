package module_4.M4_p4_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Creating a ListIterator for the list
        ListIterator<String> iterator = colors.listIterator();

        // Forward iteration using hasNext() and next()
        System.out.println("Forward Iteration:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // Backward iteration using hasPrevious() and previous()
        System.out.println("\nBackward Iteration:");
        while (iterator.hasPrevious()) {
            String color = iterator.previous();
            System.out.println(color);
        }

        // Adding elements while iterating
        iterator = colors.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Green")) {
                // Add a new color after "Green"
                iterator.add("Yellow");
            }
        }

        // Printing the modified list
        System.out.println("\nList after adding 'Yellow' after 'Green': " + colors);

        // Removing elements while iterating
        iterator = colors.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.equals("Blue")) {
                // Remove the color "Blue"
                iterator.remove();
            }
        }

        // Printing the final list
        System.out.println("List after removing 'Blue': " + colors);
    }
}
