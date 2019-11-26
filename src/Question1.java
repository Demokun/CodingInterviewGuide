/**
 * 栈和队列：设计一个有getMin功能的栈
 */

import java.util.*;
public class Question1{
    //public Question1(){};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack num = new Stack();
        Stack min = new Stack();
        int minNum = Integer.MAX_VALUE;
        int N = sc.nextInt();
        for(int i = 0;i < N;i ++){
            String s1 = sc.next();
            if(s1.equals("push")){
                int val1 = sc.nextInt();
                num.push(val1);
                if(val1 < minNum){
                    minNum = val1;
                }
                min.push(minNum);
            }
            if(s1.equals("pop")){
                if(num.isEmpty() || min.isEmpty()){
                    return;
                }
                else{
                    num.pop();
                    min.pop();
                    if(!min.isEmpty()){
                        minNum = (int)min.peek();
                    }
                    else{
                        minNum = Integer.MAX_VALUE;
                    }
                }
            }
            if(s1.equals("getMin")){
                System.out.println(minNum);
            }
        }
        return;
    }
} 