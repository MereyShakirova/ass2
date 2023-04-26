public interface MyList<T> {
    int size();//returns the number of elements in the list.
    boolean contains(Object o);//Returns true if the list contains the specified element, false otherwise.
    void add(T item);//Adds the specified item to the end of the list.
    void add(T item, int index);//Inserts the specified item at the specified position in the list. Throws an IndexOutOfBoundsException if the specified index is out of range.
    boolean remove(T item);//Removes the first occurrence of the specified item from the list, if present. Returns true if the element has been removed, false otherwise.
    T remove (int index);//removes the element at the specified position in the list. Returns the removed element. Throws an IndexOutOfBoundsException if the specified
    void clear();//removes all elements from the list.
    T get(int index);//returns the element at the specified position in the list. Throws an IndexOutOfBoundsException if the specified index is out of range.

    int indexOf(Object o);//Returns the index of the first occurrence of the specified element in the list, or -1 if the element is not found.

    int lastIndexOf(Object o);//Returns the index of the last occurrence of the specified element in the list, or -1 if the element was not found

    void sort();//sorts the elements in a list in ascending order based on their natural order. If the elements do not implement the Comparable interface, an exception will be thrown at run time
}

