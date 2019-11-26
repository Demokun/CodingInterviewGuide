import java.util.*;
public class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        int N  = sc.nextInt();
        for(int i = 0;i < N;i ++){
            String op = sc.next();
            if(op.equals("add")){
                int num = sc.nextInt();
                s1.push(num);
            }
            if(op.equals("peek")){
                if(!s2.isEmpty()){
                    System.out.println(s2.peek());
                }
                if(s2.isEmpty() && !s1.isEmpty()){
                    int tmp = 0;
                    while(!s1.isEmpty()){
                        tmp = (int)s1.peek();
                        s1.pop();
                        s2.push(tmp);
                    }
                    System.out.println(s2.peek());
                }
            }
            if(op.equals("poll")){
                if(!s2.isEmpty()){
                    s2.pop();
                    System.out.println(s2.peek());
                }
                if(s2.isEmpty() && !s1.isEmpty()){
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }
                    s2.pop();
                    System.out.println(s2.peek());
                }
            }
        }
        return;
    }
}
