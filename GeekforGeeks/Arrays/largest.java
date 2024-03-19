//To find largest element in an array
//Ways to solve it 
//1.Iteratice method
//2.Java 8 Stream
//3.Sorting
//4.Collections.max
package GeekforGeeks.Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List; 
public class largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        largest ls = new largest();
        int res1=ls.interative(arr);
        int res2=ls.javastream(arr);
        int res3=ls.sorting(arr);
        int res4=ls.Collections(arr);
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" +res4);

        
    }
    //1.
    public int interative(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    //2.
    public int javastream(int arr[])
    {
        int max=Arrays.stream(arr).max().getAsInt();
        return max;
    }
    //3.
    public int sorting(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //or Arrays.sort(array);
        return arr[arr.length-1];
    }
    //4.
    public int Collections(int arr[])
    {
        List<Integer> list =new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        return Collections.max(list);
    }
}
