import java.util.NoSuchElementException;

/**
 * Your implementation of a LinkedDeque.
 *
 * @author Ariya Nazari Foroshani
 * @version 1.0
 * @userid aforoshani3
 * @GTID  903627990
 *
 * Collaborators: None
 *
 * Resources: None
 */
public class LinkedDeque<T> {

    // Do not add new instance variables or modify existing ones.
    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size;

    // Do not add a constructor.

    /**
     * Adds the element to the front of the deque.
     *
     * Must be O(1).
     *
     * @param data the data to add to the front of the deque
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addFirst(T data) {
        if (data == null) {
            throw new IllegalArgumentException("the data given is null");
        }
        LinkedNode<T> newNode = new LinkedNode<>(data, null, null);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * Adds the element to the back of the deque.
     *
     * Must be O(1).
     *
     * @param data the data to add to the back of the deque
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addLast(T data) {
        if (data == null) {
            throw new IllegalArgumentException("the data given is null");
        }
        LinkedNode<T> newNode = new LinkedNode<>(data, null, null);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrevious(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     * Removes and returns the first element of the deque.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the front of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */

    public T removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException("No element exist to remove");
        }
        T toReturn;
        if (size == 1) {
            toReturn = head.getData();
            head = null;
            tail = null;
        } else {
            toReturn = head.getData();
            head = head.getNext();
            head.setPrevious(null);
        }
        size--;
        return toReturn;
    }



    /**
     * Removes and returns the last element of the deque.
     *
     * Must be O(1).
     *
     * @return the data formerly located at the back of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */

    public T removeLast() {
        if (size == 0) {
            throw new NoSuchElementException("No element exist to remove");
        }
        T toReturn;
        if (size == 1) {
            toReturn = head.getData();
            head = null;
            tail = null;
        } else {
            toReturn = tail.getData();
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        size--;
        return toReturn;
    }

    /**
     * Returns the first data of the deque without removing it.
     *
     * Must be O(1).
     *
     * @return the data located at the front of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */

    public T getFirst() {
        if (size == 0) {
            throw new NoSuchElementException("deque is empty");
        }
        return head.getData();
    }


    /**
     * Returns the last data of the deque without removing it.
     *
     * Must be O(1).
     *
     * @return the data located at the back of the deque
     * @throws java.util.NoSuchElementException if the deque is empty
     */

    public T getLast() {
        if (size == 0) {
            throw new NoSuchElementException("deque is empty");
        }
        return tail.getData();
    }


    /**
     * Returns the head node of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return node at the head of the deque
     */
    public LinkedNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return node at the head of the deque
     */
    public LinkedNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the deque.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the deque
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}
