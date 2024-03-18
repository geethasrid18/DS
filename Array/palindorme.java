//To check if the given String is palindrome or not
package Array;
import java.util.*;
public class palindorme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str =new String();
        str=sc.nextLine();
        strpalindorme(str);

    }
    static void strpalindorme(String str)
    {
        char[] charArray=str.toCharArray();
        int start=0,count=0;
        int end=charArray.length-1;
        while(start!=end)
        {
            if(charArray[start]==charArray[end])
            {
                count++;
                System.out.println(count);
            }
            else
            break;
            start++;
            end--;
        }
        if(count==0)
        System.out.print("Not Palindorme");
        else
        System.out.print("Palindorme");
    }
}
