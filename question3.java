package Sorting_Ass_Questions;
import java.util.*;

public class question3 {
    public static void dInsertionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        dInsertionSort(arr);
        System.out.println("The sorted array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
