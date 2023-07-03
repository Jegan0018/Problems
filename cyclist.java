package problems;

import java.util.Scanner;

public class cyclist {

	public static void main(String[] args) {
		int[] a= {1,3,5,1,0,1};
		int n=6;

     // Initialize variables
        int currentStop = 0;
        int nextStop = a[0];
        int numStops = 0;

        // Iterate through the pitstops
        for (int i = 0; i < n-1 ; i++) {
            // Update next reachable pitstop
            nextStop = Math.max(nextStop, i + a[i]);
            
            // Check if we need to stop at current pitstop
            if (i == currentStop) {
                // Update current reachable pitstops
                currentStop = nextStop;
//                nextStop = i + a[i + 1];
                numStops++;
            }
        }
        System.out.println(numStops);
	}
}
