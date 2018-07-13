/* POST & PRE INCREMENT IN JAVA */

class prepost
{
public static void main(String args[])
{
   int i=5;
int j= i++;    // i++  -> Post Increment 

System.out.println(j + ":" + i);
    i=5;
   j=++i;
System.out.println(j+ ":" + i);
}
}