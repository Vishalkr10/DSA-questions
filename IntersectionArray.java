//intersection of two arrays
import java.util.ArrayList;
public class IntersectionArray {
    public static ArrayList<Integer> intersectionArray(int arr1[],int arr2[]){
        ArrayList <Integer> res=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    if(!res.contains(arr1[i])){
                        res.add(arr1[i]);
                    }
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr1[]={1,2,3,4};
        int arr2[]={2,3,4,5};
        System.out.println(intersectionArray(arr1,arr2));
    }
    
}
