/* PRINT ASCII VALUES IN JAVA */

class asciivalues
{
 public static void main(String args[])
{
         // ASCII is of 7 bits
         // 2^7 = 128
         //  Range : 0 - 127

   for(int i=0;i<=127;i++)
{
  System.out.printf("%d : %c \n ",i,i);
}
}
}