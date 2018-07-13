/* LABELED BREAK STATEMENT IN JAVA */

class labeledbreak
{
public static void main(String args[])
{
kishan:
for(int i=1;i<=4;i++)
{
     for(int j=1;j<=4;j++)
      {
           if(i==3)
            break kishan;     //labeled break statement  
         System.out.print("* ");
      }
     System.out.println("");
}

}

}