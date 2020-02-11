package com.asif.spring.starterproject.autowiring;

public class Solution {

    // Complete the stepPerms function below.
    static void stepPerms(int n) {
        int[] count = new int[3];
        int[] steps = new int[3];
        for(int i=0; i<3; i++){
            count[i] = n / (i+1);
            steps[i] = i+1;
        }
        int stepsReached = 0;
        System.out.println(permutation(count, steps, n, stepsReached, 0));
    }

    static int permutation(int[] count, int[] steps, int n, int stepsReached, int total){
        if(n == stepsReached) {
        		return total+1;
        }
        
        for(int i=0; i<count.length; i++){
            if(count[i] == 0) continue;
            count[i]--;
            total = permutation(count, steps, n, stepsReached+steps[i], total);
            count[i]++;
        }
        return total;
    }
    
    public static void main(String[] args) {
		int n = 7;
		stepPerms(n);
		
	}
}