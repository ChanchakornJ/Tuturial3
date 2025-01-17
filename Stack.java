// Chanchakorn Jullapech
// 672115007
import java.util.*;
public class Stack{
    private int maxSize;
    private int top;

    Vector <String> StudentStack = new Vector();


    public Stack(int size){  
        top = -1; 
        maxSize = size;
        this.StudentStack = new Vector(size);
    }

    public void push(String fname, String lname, double gpa, int stuID){
        String info;
        if(top == maxSize -1){
            System.out.println("Stack overflow");
            return;
        }

        info = fname + ", " + lname + ", " + gpa + ", " + stuID;
        StudentStack.addElement(info);
        System.out.println(info + " pushed into the stack");
        top++;
    }

    public String pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return "-1";
        }

        String poppedElement = StudentStack.get(top);
        StudentStack.removeElementAt(top--);
        System.out.println(poppedElement + " popped from the stack");
        
        return poppedElement;
        
    }

    public void peek(){System.out.println(StudentStack.get(top));}

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }
    public void display(){
        System.out.println("Student list:");
        for(int i = 0; i< StudentStack.size(); i ++){
            System.out.println(StudentStack.get(i));
        }
    }

}
