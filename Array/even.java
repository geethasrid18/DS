//To remove the even number in a array
//output-->array
package Array;
import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        even(n, ar);
    }
    static void even(int n,int arr[])
    {
        int evencount=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            evencount++;
        }
        int[] evenaarr=new int[evencount];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<evencount;j++)
            {
                if(arr[i]%2==0)
                {
                    evenaarr[j]=arr[i];
                    System.out.println(evenaarr[j]);
                    break;
                }
            }

        }
        
    }
}
