package LectureAndExtra.InsertionSort;

/**
 * Code Insertion Sort
 * Send Feedback
 * Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
 * --------------------------
 *  Note:
 * Change in the input array/list itself. You don't need to return or print the elements.
 * ---------------------------
 *  Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First line of each test case or query contains an integer 'N' representing the size of the array/list.
 *
 * Second line contains 'N' single space separated integers representing the elements in the array/list.
 * ---------------------------
 *  Output Format :
 * For each test case, print the elements of the array/list in sorted order separated by a single space.
 *
 * Output for every test case will be printed in a separate line.
 * --------------------------
 *  Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * Time Limit: 1 sec
 * -------------------
 * Sample Input 1:
 * 1
 * 7
 * 2 13 4 1 3 6 28
 * Sample Output 1:
 * 1 2 3 4 6 13 28
 * -------------------
 * Sample Input 2:
 * 2
 * 5
 * 9 3 6 2 0
 * 4
 * 4 3 2 1
 * Sample Output 2:
 * 0 2 3 6 9
 * 1 2 3 4
 */

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,9,4};
        insertionSort(arr);
        for (int  i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void insertionSort(int[] arr) {
        //Your code goes here
        // Two for loop required

        // first loop to select the index from [1 to n-1]
        for (int i = 1 ; i < arr.length ; i++){
            int element = arr[i];
            // second loop to arrange the  element inside the sorted section of the array
            for (int j = i-1; j >=0 ; j--){
                if (element<arr[j]){
                    // shift the j to j+1 and in place of j put the arr[i] value
                    arr[j+1]= arr[j];
                    arr[j]= element;
                }
            }
        }
    }

}
