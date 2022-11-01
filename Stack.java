package proj4;

/**
 * Represents the Stack ADT.  Items on the Stack are returned on
 * a first-in, last-out basis, meaning the most recently added
 * item will be returned when an item needs to be removed.
 * Items are not accessible by index, and are only able to be added
 * and removed from the top.
 *
 * INVARIANTS:
 * 1. All items are stored in an array "holder" which can hold
 *      objects of a user-defined type.
 * 2. "items" is equal to the number of user-defined objects in
 *      the Stack
 * 3. If "items" == 0, the Stack is empty
 * 4. Items cannot be accessed via index, but can be added and
 *      removed from the top of the Stack
 * 5. The bottom of the stack is at holder[0], and the top is
 *      at holder[items-1]
 * 6. If items == capacity, capacity will double

 */
public class Stack<T> {

    private T data;
    private  Object[] holder;
    private int items;
    private final int DEFAULT_CAPACITY = 10;
    private final int EMPTY = 0;

    /**
     * Default Stack Constructor
     */
    public Stack() {
        this.holder = new Object[DEFAULT_CAPACITY];
        this.items = EMPTY;
    }

    /**
     * Non-default constructor
     * @param capacity The initial capacity of the Stack
     */
    public Stack(int capacity) {
        this.holder = new Object[capacity];
        this.items = EMPTY;
    }

    /**
     * checks if the Stack is empty
     * @return true if empty, false if not
     */
    public boolean isEmpty() {  
    	return this.size() == EMPTY;
    }

    /**
     * Pushes an item to the top of the stack
     * @param toPush item to push
     */
    public void push(T toPush) {
        if (this.size() == this.getCapacity()){
            this.ensureCapacity(this.size()*2);
        }
        this.holder[this.size()] = toPush;
        this.items++;
    }

    /**
     * gets the capacity of the Stack
     * @return the capacity
     */
    public int getCapacity(){
        return this.holder.length;
    }

    /**
     * If the capacity of the Stack is less than the minCapacity,
     * then the capacity of the stack is doubled
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity){
        if(this.getCapacity() < minCapacity){
            Object[] newHolder = new Object[minCapacity];
            System.arraycopy(this.holder, 0, newHolder, 0, this.getCapacity());
            this.holder = newHolder;
        }
    }

    /**
     * Removes and returns the item at the top of the stack
     * @return item at top of the stack
     */
    public T pop() {
        if (this.isEmpty()){
            return null;
        }
        T toReturn = (T) this.holder[this.topIndex()];
        this.items--;
        return toReturn;
    }

    /**
     * displays th item at the top of the Stack, but
     * does not remove it
     * @return item at the top of the Stack
     */
    public T peek() {
        if(!this.isEmpty()){
            return (T) this.holder[this.topIndex()];
        }
        return null;
    }

    /**
     * @return the number of items in the Stack
     */
    public int size() {
    	return this.items;
    }

    /**
     * @return a String representation of all items
     *  in the Stack
     */
    public String toString() {
        String string = "{>";
        for(int i=this.size(); i-- > 0;){
            string += this.holder[i];
            if(i != 0){
                string += ", ";
            }
        }
        return string += "}";
    }


    /** ------------------------------
     *      PRIVATE HELPER METHODS
     * _______________________________
     */

    /**
     * @return the index of the item on the top of the Stack
     */
    private int topIndex(){
        return this.size()-1;
    }

} 
   

