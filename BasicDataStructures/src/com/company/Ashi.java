package com.company;

import java.util.*;
public class Ashi
{
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c = 0,f=0;

        for(int i=0; i<str.length(); i++){
            f=0;
            if(i==0){
                char ch = str.charAt(i);
                for(int j=0; j<str.length(); j++){
                    if(ch == str.charAt(j)) {
                        c++;
                    }
                }
                System.out.println("Count of "+ch+" is "+c);
                c = 0;
            }

            else{
                char ch = str.charAt(i);
                for(int j=0;j<i;j++){

                    if(ch == str.charAt(j)){

                        f++;
                    }

                }
                if(f!=0){
                    continue;
                }

                else{


                    for(int j=0; j<str.length(); j++){
                        if(ch == str.charAt(j)) {
                            c++;
                        }
                    }
                    System.out.println("Count of "+ch+" is "+c);
                    c = 0;
                }

            }

        }
    }
}