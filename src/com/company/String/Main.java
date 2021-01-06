package com.company.String;

import java.util.Stack;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        String str = null;
        Stack<Character> stack = new Stack<>();

        try{
            for(char i: str.toCharArray())
                stack.push(i);
        }catch(Exception e) {System.out.println("error");}
       StringBuffer reverseString= new StringBuffer();
       while(!stack.empty()){
           reverseString.append(stack.pop());
       }
        System.out.println(reverseString.toString());
    }
}
