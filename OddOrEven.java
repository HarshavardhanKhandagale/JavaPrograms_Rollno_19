import java.util.*;

public class OddOrEven{
    public static void main(String[] args) 
    {

        int No=0;

        System.out.print("\nEnter a Number:");
        Scanner S= new Scanner(System.in);
        No =S.nextInt ();

        if (No % 2 ==0)
        {
            System.out.print("\n Number is Odd:");
        }
        else
        {
            System.out.print("\n Numer is Even:");
            System.out.print("Thanks:");
        }
    }
}
 