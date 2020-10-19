
import java.util.*;
class Stack { 
    static final int maxSize = 1000; 
    int top; 
    int a[] = new int[maxSize]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (maxSize - 1)) { 
            System.out.println("Overflowed"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Underflowed"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Underflowed"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
} 
  
class StackImpl { 
    public static void main(String args[]) 
    { 
    	Scanner sc = new Scanner(System.in);
        new Stack().push(10); 
        
        System.out.println(new Stack().pop() + " Popped from stack"); 
    } 
} 