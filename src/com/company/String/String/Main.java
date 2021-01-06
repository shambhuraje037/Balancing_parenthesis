package com.company.String;

import com.company.String.BalancingExpresion;

import java.util.Stack;
import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {
        String str="()";
        BalancingExpresion expresion1= new BalancingExpresion();
        var result= expresion1.expresion(str);
        System.out.println(result);

    }
}
