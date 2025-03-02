//find occurence of first and last element in unsorted array
public class FindOccurence {
    public static int[] findOccurence(int arr[],int ele){
        int start=-1,end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                if(start==-1){
                    start=i;
                }
                end=i;
            }
            
        }
        return new int[]{start,end};

    }
    public static void main(String args[]){
        int arr[]={1,2,3,6,4,3,6,7,3,1};
        int ele=3;
        int result[]=findOccurence(arr,ele);
        System.out.println(findOccurence(arr, ele));
    }
    
}
