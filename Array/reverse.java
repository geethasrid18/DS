
package Array;
import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        reverse r=new reverse();
        r.reversearr(ar, 0, n-1);
        r.reverseprint(n, ar);
    }
    public void reverseprint(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    //Swapping of the elements eg:0 and n-1,1 and n-2
    public static void reversearr(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
