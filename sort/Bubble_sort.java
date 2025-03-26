package sort;

public class Bubble_sort {
   
   public  int[] bubbleSort(int[] arr,int n){
            int temp;
             for(int i=0;i<n-1;i++){
                boolean swapped=false;
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                          temp=arr[j+1];
                          arr[j+1]=arr[j];
                          arr[j]=temp;
                          swapped=true;
                    }
                }
                if (!swapped) {
                    break;
                }
             }
            return arr;
    }
   
   
}
