package Sorting_Ass_Questions;
import java.util.*;
public class question2 {
    public static void dSelectionsort(int []arr){
        for(int i=0;i<arr.length;i++){
            int min_indx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min_indx]){
                    min_indx=j;
                }
            }
            if(min_indx!=i){
                int temp=arr[i];
                arr[i]=arr[min_indx];
                arr[min_indx]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        dSelectionsort(arr);
        System.out.println("The sorted array is:");
        System.out.println(Arrays.toString(arr));

    }
}
