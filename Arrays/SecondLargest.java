// Day 1 / 160
// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735

public class SecondLargest {
    public static int getSecondLargest(int arr[]) {
        int largest = -1;
        int secondLargest = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            } 
        }
        
        return secondLargest;
    }

    public static void main(String args[]) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.print(getSecondLargest(arr));
    }
}