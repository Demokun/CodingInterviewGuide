import java.util.*;
public class Question3 {
    public int getStackBottom(Stack s){
        int result = (int)s.pop();
        if(s.isEmpty()){
            return result;
        }
        else{
            int last = getStackBottom(s);
            s.push(result);
            return last;
        }
    }
    public void reverse(Stack s){
        if(s.isEmpty()){
            return ;
        }
        else{
            int i = getStackBottom(s);
            reverse(s);
            s.push(i);
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int length = sc.nextInt();
        Stack s = new Stack();
        for(int i = 0;i < length;i ++){
            s.push(sc.nextInt());
        }
        for(int j =0;j < length;j ++){
            System.out.print(s.pop() + " ");
        }
        Question3 m = new Question3();
        m.reverse(s);
        for(int j = 0;j < length;j ++){
            System.out.print(s.pop() + " ");
        }
    }
}
