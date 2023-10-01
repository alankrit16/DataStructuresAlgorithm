package com.company;

import java.util.*;

public class Main {

    private static int[] dx = {-2,-2,-1,-1,1,1,2,2};
    private static int[] dy = {-1,1,-2,2,-2,2,-1,1};

    public static void main(String[] args) {
        String expression = "-1/2+1/2+1/3";
        Scanner sc = new Scanner(expression).useDelimiter("/|(?=[-+])");
        int A = 0, B = 1;
        while (sc.hasNext()) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.print(a+" ");
            System.out.print(b);
            System.out.println();
        }

        Medians medians = new Medians();
        System.out.println(medians.q1);
        medians.addNum(1);
        System.out.println(medians.q1);
        medians.addNum(2);
        System.out.println(medians.q2);
        System.out.println(medians.findMedian());
        medians.addNum(3);
        System.out.println(medians.q1);
        System.out.println(medians.q2);
        System.out.println(medians.findMedian());
    }

    public static int helper(int N, int x, int y){
        int count = 0;
        for(int i=0;i<dx.length;i++){
            if((0<=x+dx[i] && x+dx[i]<N) && (0<=y+dy[i] && y+dy[i]<N)){
                System.out.println((x+dx[i])+","+(y+dy[i]));
                count++;
            }
        }
        return count;
    }

//    public static int minSubArrayLen(int target, int[] nums) {
//        int sum = 0;
//        int left = 0;
//        int result = Integer.MAX_VALUE;
//        for(int i=0;i<nums.length;i++){
//            sum = sum + nums[i];
//            while(sum>=target){
//                result = Math.min(result,i-left+1);
//                sum = sum - nums[left];
//                left++;
//            }
//        }
//
//        return result == Integer.MAX_VALUE? 0: result;
//    }

}










//        int candidate = Integer.MIN_VALUE;
//        DirectedGraph graph = new DirectedGraph();
//        graph.addEdge(1,2);
//        graph.addEdge(1,4);
//        graph.addEdge(2,3);
//        graph.addEdge(2,4);
//        graph.addEdge(4,3);
//        graph.addEdge(3,1);
//        HashMap<Integer,ArrayList<Integer>> directedGraph = graph.graph;
//        System.out.println(directedGraph);
//        for (int key:
//             directedGraph.keySet()) {
//            if(directedGraph.get(key).size()==0){
//                candidate = key;
//            };
//        }
//        for (int key:
//             directedGraph.keySet()) {
//            if(key!=candidate){
//                if(!directedGraph.get(key).contains(candidate)){
//                    System.out.println(false);
//                    return;
//                }
//            }
//        }
//        System.out.println(true);
//    }

//        int[][] m = new int[5][3];
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < m[0].length ; j++) {
//                System.out.print(m[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(m.length);
//        System.out.println(m[0].length);
//
//        int[] arr = new int[]{10,100,300,200,1000,20,30};
//        int k = 3;
//        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i:arr){
//            heap.add(i);
//            if(heap.size()>k){
//                heap.poll();
//            }
//        }
//        ArrayList<Integer> ar = new ArrayList<>(heap);
//        System.out.println(ar.get(0)-ar.get(ar.size()-1));
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter val");
////        int val = sc.nextInt();
////        int temp = 0;
//        HashMap<Character,Integer> s = new HashMap<>();
//        String string = "SAAREJAHAN";
//        String res="";
//        for (int i = 0; i < string.length() ; i++) { //O(n)
//            if(!s.containsKey(string.charAt(i))) { // O(1)
//                s.put(string.charAt(i), 0); //O(1)
//                res = string.charAt(i) + res; //O(1)
//            }
//        }
//        System.out.println(s.toString());
//        System.out.println(res);
//
//        int[] ans = rotate(new int[]{-1,-100,3,99}, 2);
//        System.out.print("[");
//        for (int i:
//             ans) {
//            System.out.print(i + " ");
//        }
//        System.out.print("]");
//
//    }
//
//    public static int[] rotate(int[] nums, int k) {
//        int n = nums.length;
//        k = k%n;
//        reverse(nums,0,n-k-1); //  k/2
//        reverse(nums, n-k,nums.length-1); // (n-k)/2
//        reverse(nums, 0, nums.length-1); //n/2
//        return nums;
//    }
//
//    private static void reverse(int[] nums, int start, int end) {
//        while(start<=end){
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }


