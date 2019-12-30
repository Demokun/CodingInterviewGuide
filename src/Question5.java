import java.util.*;
public class Question5 {
    public void sortStack(Stack<Integer> s) {
        Stack<Integer> help = new Stack();
        while (! s.isEmpty()) {
            int cur = s.pop();
            //System.out.println(cur);
            if (help.isEmpty() || help.peek() > cur) {
                help.push(cur);
            }
            while(cur > help.peek()){
                s.push(help.pop());
                if(help.isEmpty()||cur < help.peek()){
                    help.push(cur);
                }
            }
        }
        while(!help.isEmpty()){
            int data = help.pop();
            s.push(data);
        }
    }
    public static void main(String[] args){
        Stack<Integer> s  = new Stack();
        s.push(5);
        s.push(2);
        s.push(6);
        s.push(3);
        s.push(4);
        s.push(1);
        Question5 q = new Question5();
        q.sortStack(s);
        System.out.println(s);
    }
}
