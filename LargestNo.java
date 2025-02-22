import java.util.Scanner;
public class LargestNo{
    public static int findLargestNo(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,4,6,7,3};
        System.out.println(findLargestNo(arr));
    }

}