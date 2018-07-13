/* SHORT HAND OPERATIONS IN JAVA */

public class shorthand
{
    public static void main(String args[])
{
     int i=5;
     i +=2;    // i = i + 2
     System.out.println(i);
   
  i *=2;    // i = i + 2
     System.out.println(i);
   
      byte b=8;
  //  b = b*2.5;   // Double 20.0 but this will give error
b*=2.5;             // while this will not give error.
System.out.println(b);
}
}