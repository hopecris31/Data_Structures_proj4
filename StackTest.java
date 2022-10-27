package proj4;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * 
 * Write a description of class StackTest here.
 * 
 * @author Hope Crisafi
 * @version (a version number or a date)
 *
 */
public class StackTest {

	@Rule
    public Timeout timeout = Timeout.millis(100);
	
    private Stack<String> stack;
    
    @Before
    public void setUp() throws Exception {
        stack = new Stack<String>(4);
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test //Tests Stack constructor
    public void testStackConstructor_toString () {
        assertEquals ("An empty stack. (> indicates the top of the stack)", "{>}", stack.toString());
    }

    @Test //Pushes A onto an empty stack
    public void testStackPushOneOntoEmptyStack () {
        stack.push("A");
        assertEquals ("{>A}", stack.toString());
    }
    
    @Test //Pushes A then B onto an empty stack
    public void testStackPushTwoOntoEmptyStack () {
        stack.push("A");
        stack.push("B");
        assertEquals ("{>B, A}", stack.toString());
    }
    
    @Test //Pushes A, then B, then C onto an empty stack
    public void testStackPushThreeOntoEmptyStack () {
        stack.push("A");
        stack.push("B");
        stack.push("C");
        assertEquals ("{>C, B, A}", stack.toString());
    }

    @Test //Adds a fifth element to a stack with a capacity of 4, should expand to add element and increase capacity. Capacity should be doubled
    public void testStackPushNeedIncreaseCapacity() {
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        assertEquals ("{>E, D, C, B, A}", stack.toString());
        assertEquals(8, stack.getCapacity());
    }

    @Test //Tests pop, returns the item at the top of the stack
    public void testStackPop(){
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals ("C", stack.pop());
    }

    @Test //Tests pop, returns the item at the top of the stack
    public void testStackPopEmpty(){

        assertEquals (null, stack.pop());
    }

    @Test //Tests isEmpty; tested on non-empty stack
    public void testisEmptyTrue(){
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertFalse(stack.isEmpty());
    }

    @Test //Tests isEmpty; tested on empty stack
    public void testisEmptyFalse(){

        assertTrue(stack.isEmpty());
    }

    @Test //Tests isEmpty; tested on empty stack
    public void testGetCapacity(){

        assertEquals(4, stack.getCapacity());
    }

    @Test //Tests ensureCapacity; increases the capacity
    public void testEnsureCapacity(){
        assertEquals(4, stack.getCapacity());

        stack.ensureCapacity(8);

        assertEquals(8, stack.getCapacity());
    }

    @Test //Tests ensureCapacity; does not need to increase the capacity
    public void testEnsureCapacityNoIncrease(){
        assertEquals(4, stack.getCapacity());

        stack.ensureCapacity(2);

        assertEquals(4, stack.getCapacity());
    }

    @Test //Tests Size; the stack is empty
    public void testSizeEmpty(){

        assertEquals(0, stack.size());
    }

    @Test //Tests Size; there are items in the stack
    public void testSize(){
        stack.push("A");
        stack.push("B");

        assertEquals(2, stack.size());
    }

}