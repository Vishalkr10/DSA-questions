import java.util.*;
// Nested if-else (Multiple Conditions)
//Agar ek condition ke andar aur bhi conditions check karni ho, to nested if-else use karte hain.
//Example: Check Positive, Negative, or Zero
public class NumberCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
    
}
