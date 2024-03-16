import java.sql.Time;
public class TimeComplexityDemo {
 public static void main(String args[])
 {
    double now=System.currentTimeMillis();
    TimeComplexityDemo tc=new TimeComplexityDemo();
    System.out.println(tc.findSum(9999));
    System.out.println("Time Taken-"+(System.currentTimeMillis()-now)+"ms");
 }
public int findSum(int s)
{
    return s*(s+1)/2;
}
//Output:
//49995000
//Time Taken-4.0ms

// public int findSum(int s)
// {
//     int sum=0;
//     for(int i=1;i<=s;i++)
//     {
// sum=sum+i;
//     }
//     return sum;
// }

//Output:
//49995000
//Time Taken-14.0ms  
}
