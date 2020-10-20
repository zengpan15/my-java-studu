package week2;

import java.util.Stack;
public class SqStackClass {

    static char[] in={'a','b','c'};

    public static void main(String[] args){
        fun(0,new Stack<Character>(),"");
    }

    static void fun(int n, Stack <Character> stk, String sout)
    {
        //System.out.println("当前进度"+n+"    "+"当前已出"+sout);

        if(n == in.length && stk.isEmpty()){
            System.out.println(sout);
        }
        else
        {
            Stack<Character> s1=(Stack<Character>) stk.clone();
            Stack<Character> s2=(Stack<Character>) stk.clone();

            if (n <  in.length) {
                s1.push(in[n]);
                fun(n + 1, s1, sout + "");
            }

            if (!s2.isEmpty()){

                String temp=sout+ s2.peek();
                s2.pop();
                fun(n, s2, temp);
            }
        }
    }
}

