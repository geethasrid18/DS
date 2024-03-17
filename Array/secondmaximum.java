//To find the second larget number in an array
//Solution:
//1.Sort the array in ascending order and return in n-2 value
//or
//2.Store the maximum value and second value
package Array;
import java.util.*;
public class secondmaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=secmax(arr);
        System.out.println(res);
    }
    static int secmax(int arr[])
    {
        int max=0,secondmax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondmax=max;
                max=arr[i];
            }
            else if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
            }
    
        }
        return secondmax;
    }

}
