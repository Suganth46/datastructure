package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={123,4,35,86,24328,423,7867,7654};
        /* Bubble_sort bs=new Bubble_sort();
       System.out.println( Arrays.toString(bs.bubbleSort(arr, arr.length))); */
       /* Insertion_sort Is=new Insertion_sort();
       System.out.println(Arrays.toString(Is.insertionSort(arr, arr.length))); */
       Selection_sort ss=new Selection_sort();
       System.out.println(Arrays.toString(ss.selection_Sort(arr, arr.length)));
      
    }
}
