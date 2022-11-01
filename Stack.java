package proj4;

// Don't forget the Javadocs!
// Notice that the generic type parameter does NOT implement
// the Token interface.  Make sure you understand why it shouldn't
// (and see the StackTest class for a hint.  Or just ask me!)

/**
 * represents the Stack ADT.
 * @param <T>
 */
public class Stack<T> {

    private T data;
    private  Object[] holder;
    private int items;
    private int DEFAULT_CAPACITY = 10;
    
    public Stack() {
        this.holder = new Object[DEFAULT_CAPACITY];
        this.items = 0;
    }

    public Stack(int capacity) {
        this.holder = new Object[capacity];
        this.items = 0;
    }
   
    public boolean isEmpty() {  
    	return this.size() == 0;
    }

    public void push(T toPush) {
        if (this.size() == this.getCapacity()){
            this.ensureCapacity(this.size()*2); //should this be double or double +1
        }
        this.holder[this.size()] = toPush;
        this.items++;
    }

    public int getCapacity(){
        return this.holder.length;
    }

    public void ensureCapacity(int minCapacity){
        if(this.getCapacity() < minCapacity){
            Object[] newHolder = new Object[minCapacity];
            System.arraycopy(this.holder, 0, newHolder, 0, this.getCapacity());
            this.holder = newHolder;
        }
    }

    public T pop() {
        if (this.isEmpty()){
            return null;
        }
        T toReturn = (T) this.holder[this.topIndex()];
        this.items--;
        return toReturn;
    } 
  
    public T peek() {
        if(!this.isEmpty()){
            return (T) this.holder[this.topIndex()];
        }
        return null;
    } 
    
    public int size() {
    	return this.items;
    }
     
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

    private int topIndex(){
        return this.size()-1;
    }
} 
   

