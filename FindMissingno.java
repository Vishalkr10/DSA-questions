public class FindMissingno {
    public static int findMissing(int arr[],int n){
        int sum=(n*(n+1))/2;
        int arrsum=0;
        for(int i=0;i<arr.length;i++){
            arrsum=arrsum+arr[i];

        }
        return sum-arrsum;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        int n=5;
        System.out.println(findMissing(arr, n));

    }
    
}
