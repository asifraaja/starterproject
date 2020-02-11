package com.asif.spring.starterproject.autowiring;

public class Solution2 {
	static int total = 0;
	// Complete the stepPerms function below.
    static void stepPerms(int n) {
        int[] count = new int[3];
        int[] steps = new int[3];
        for(int i=0; i<3; i++){
            count[i] = n / (i+1);
            steps[i] = i+1;
        }
        int stepsReached = 0;
        permutation(count, steps, n, stepsReached);
        System.out.println(total);
    }

    static void permutation(int[] count, int[] steps, int n, int stepsReached){
        if(n == stepsReached) {
        		total = total + 1;
        }

        for(int i=0; i<count.length; i++){
            if(count[i] == 0) continue;
            count[i]--;
            permutation(count, steps, n, stepsReached+steps[i]);
            count[i]++;
        }
    }
    
    public static void main(String[] args) {
		int n = 7;
		stepPerms(n);
		
	}
}
