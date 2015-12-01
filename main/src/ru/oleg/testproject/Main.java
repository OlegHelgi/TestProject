package ru.oleg.testproject;

import ru.Dog;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Олег on 01.12.2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        char ch='$';
        int sk=5;
        double nu=7.5;
        for(int i=0;i<10;i=i+1){
            if(i<5){
                System.out.println(i);
            }
        }
        while(sk>=0){
            System.out.println (sk);
            sk=sk-1;
        }

        System.out.println("Please, enter dog name");
        String name=readLine();

        Dog gav = new Dog(name);
        Dog graw=new Dog ("Jason");
        gav.bark(graw);
    }

    static String readLine() throws Exception {
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }
}
