//find the the missing number in an array which is present in the range
package Array;
import java.util.*;
public class missingno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int res=missing(ar);
        System.out.println(res);
    }
    static int missing(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int n=arr.length+1;
        int realsum=n*(n+1)/2;
        return realsum-sum;
    }

        
    
}
