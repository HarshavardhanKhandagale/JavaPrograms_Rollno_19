import java.util.*;
public class RevTab{
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Number : ");
        int n= sc.nextInt();
         
        for (int i=10; i>0; i--){
            
            System.out.println(i*n);

        }
    }
}