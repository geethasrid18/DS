//To print a 2D Array
//Solutions
//1.Interative method
//2.for each loop
//3.Arrays.toString();
package GeekforGeeks.Arrays;

import java.util.Scanner;

public class print2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        int c=sc.nextInt();
        int[][] arr =new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        Interative(arr, r, c);
        System.out.println("Another Method:");
        foreach(arr, r, c);
    }
    static void Interative(int arr[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void foreach(int arr[][],int r,int c)
    {
        for(int[] row:arr)//loops through the rows
        {
            for(int x:row)//loops through the coloumn in current row
            System.out.print(x+" ");
        }
    }
}
