package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class DirectedGraph {
    HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();

    public void addEdge(int a, int b){
        if(graph.containsKey(a)){
            graph.get(a).add(b);
        }else{
            ArrayList<Integer> ar = new ArrayList<>();
            ar.add(b);
            graph.put(a,ar);
        }

        if(!graph.containsKey(b)){
            graph.put(b,new ArrayList<>());
        }
    }

}
