package Sorting_Ass_Questions;
import java.util.*;

public class question1 {
    public static void dBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,6,0};
        dBubbleSort(arr);
        System.out.println("The sorted aray is : ");
        System.out.println(Arrays.toString(arr));
        }
    }

