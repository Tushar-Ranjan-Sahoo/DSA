import java.util.*;

public class SortStack {
    static void sortedInsert(Stack<Integer> s,int x){
        if(s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp); 
    }
    static void sortInsert(Stack<Integer> s){
        if(!s.isEmpty()){
            int x = s.pop();
            sortInsert(s);
            sortedInsert(s, x);
        }
    }
    static void printStack(Stack<Integer> s){
        ListIterator<Integer> it = s.listIterator();
        while(it.hasNext()) it.next();

        while (it.hasPrevious()) 
        {
            System.out.print(it.previous()+" ");    
        }
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
 
        System.out.println(
            "Stack elements before sorting: ");
        printStack(s);
 
        sortInsert(s);
 
        System.out.println(
            " \n\nStack elements after sorting:");
        printStack(s);
    }
}
