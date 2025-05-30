import java.util.Stack;

public class MyStackOperations {

    private Stack<Integer> stack;

    public MyStackOperations() {
        this.stack = new Stack<>(); 
    }

    
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    
    public Integer popElement() {
        if (!stack.empty()) {
            Integer poppedValue = stack.pop();
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null; 
        }
    }

    
    public boolean isStackEmpty() {
        boolean empty = stack.empty();
        System.out.println("Is stack empty? " + empty);
        return empty;
    }

    public static void main(String[] args) {
        MyStackOperations myStack = new MyStackOperations();

        myStack.isStackEmpty(); 

        myStack.pushElement(10);
        myStack.pushElement(20);
        myStack.pushElement(30);

        myStack.isStackEmpty(); 

        myStack.popElement();
        myStack.popElement();

        myStack.isStackEmpty(); 
        myStack.popElement();
        myStack.popElement(); 
}
    
}
