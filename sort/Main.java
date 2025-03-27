package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={123,4,35,86,24328,423,7867,7654,35,4,534,45,22,3,5,6,75,34,7,34,12,43,76,89,32,65,90,11,45,2,0};
        /* Bubble_sort bs=new Bubble_sort();
       System.out.println( Arrays.toString(bs.bubbleSort(arr, arr.length))); */
       /* Insertion_sort Is=new Insertion_sort();
       System.out.println(Arrays.toString(Is.insertionSort(arr, arr.length))); */
       Selection_sort ss=new Selection_sort();
       long startTime = System.currentTimeMillis();
       arr=ss.selection_Sort(arr, arr.length);
       long endTime = System.currentTimeMillis();
       System.out.println("time taken:"+((endTime - startTime)));
       System.out.println(Arrays.toString(arr));
      
    }
}
