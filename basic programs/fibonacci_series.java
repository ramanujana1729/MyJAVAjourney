/* PRINT FIBONACCI SERIES IN JAVA */

import java.util.Scanner;

class fibonacci_series
{
public static void main(String args[])
{
int a=1,b=1,c;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n");
int n= sc.nextInt();


for(int i=0;i<7;i++){     
c=a+b;
System.out.println(b);
a=b;

b=c;


}
}
}