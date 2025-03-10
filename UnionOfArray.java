//union of two Arrays
import java.util.ArrayList;

public class UnionOfArray {
    public static ArrayList<Integer> unionOfArrays(int arr1[],int arr2[]){
      ArrayList <Integer> res=new ArrayList<>();
      for(int i=0;i<arr1.length;i++){
        if(!res.contains(arr1[i])){
            res.add(arr1[i]);
        }
      }
      for(int i=0;i<arr2.length;i++){
        if(!res.contains(arr2[i])){
            res.add(arr2[i]);
        }

      }
      return res;
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,5,6,4};
        System.out.println(unionOfArrays(arr1, arr2));
    }
    
}
