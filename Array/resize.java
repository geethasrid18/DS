//to resize the given array to different size
package Array;
import java.util.*;
public class resize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the resize array capacity:");
        int capacity=sc.nextInt();
        resize rs=new resize();
        arr=rs.resize(arr, capacity);
        rs.print(arr);
        System.out.println("The new resized array size is: "+arr.length);

    }
    public int[] resize(int arr[],int c)
    {
        int[] newarr=new int[c];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
                System.out.println(arr[i]);
        }
    }
}
