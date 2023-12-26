package module_4.M4_p4_collection;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// CustomList class implementing the List interface
public class CustomList<E> implements List<E> {

    private Object[] elements;  // Internal array to store elements
    private int size;           // Size of the list

    // Constructor to initialize the internal array
    public CustomList() {
        elements = new Object[10];  // Initial capacity of 10
        size = 0;                   // Initial size is 0
    }

    // Method to double the capacity of the internal array if needed
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = java.util.Arrays.copyOf(elements, newCapacity);
        }
    }

    // Add element to the end of the list
    @Override
    public boolean add(E element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    // Get the size of the list
    @Override
    public int size() {
        return size;
    }

    // Check if the list is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the list contains a specific element
    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    // Get an iterator over the elements of the list
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return (E) elements[currentIndex++];
            }
        };
    }

    // Convert the list to an array
    @Override
    public Object[] toArray() {
        return java.util.Arrays.copyOf(elements, size);
    }

    // Other methods of the List interface can be implemented similarly

    // Main method to test the CustomList
    public static void main(String[] args) {
        // Create an instance of CustomList
        CustomList<String> customList = new CustomList<>();

        // Add elements to the list
        customList.add("Apple");
        customList.add("Banana");
        customList.add("Orange");

        // Print the elements in the list
        System.out.println("Elements in the list:");
        for (String element : customList) {
            System.out.println(element);
        }

        // Check if the list contains a specific element
        System.out.println("Contains 'Banana': " + customList.contains("Banana"));
        System.out.println("Contains 'Grapes': " + customList.contains("Grapes"));
    }

    // As all the methods of an interface are to be implmented the follwing lines of code are made to implement all those

    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public ListIterator<E> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }
}
