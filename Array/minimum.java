//To find the minimum value in a array
package Array;
import java.util.*;
public class minimum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int res=min(arr);
        System.out.println(res);
    }
    static int min(int arr[])
    {
    int min=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]<min)
        {
            min=arr[i];
        }
    }
    return min;
    }
}
