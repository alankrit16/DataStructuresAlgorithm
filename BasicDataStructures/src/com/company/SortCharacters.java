package com.company;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortCharacters {

    public static void main(String[] args) {
        char[] x = new char[]{'z','Z','a','x','b','e','z','y','A','x','b','e','z','X','a','x','b','e','z','y','a','x','b','e',
        'z','x','y','c','q'};
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 97,j=65; j<=90 && i <=122 ; i++,j++) {
            map.put((char) j,0);
            map.put((char) i,0);
        }
        for (int i = 0; i < x.length ; i++) {
            map.put(x[i],map.get(x[i])+1);
        }
        int index=0;
        for (char c: map.keySet()) {
            int count = map.get(c);
            while(count!=0){
                x[index] = c;
                index++;
                count--;
            }
        }
        for(char c:x){
            System.out.print(c+"\t");
        }
    }
}
