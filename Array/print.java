
package Array;
import java.util.*;
public class print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        print p=new print();
        p.print(n, ar);
    }
    public void print(int n,int arr[])
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
