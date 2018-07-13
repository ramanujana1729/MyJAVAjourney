/* Patterns With Loops */

class patterns_loops
{
public static void main(String args[])
{
// LOOP 1   
 for(int i=1;i<=4;i++)
{
         for(int j=1;j<=4;j++)
        {
              if(i==1 || i==4 || j==1 || j==4)
                {
	System.out.print('*');
	}
	
	else{	
	 System.out.print("  ");
	}
	
       }
System.out.println("	");
}

//LOOP 2
/* 1
  0 1
  1 0  1
  0 1  0 1
 1  0  1 0 1
*/
for(int i=1;i<=4;i++)
	{
  	    for(int j=1;j<=i;j++)
	    	{
                                    
if((i+j)%2==0){		
System.out.print('1');

}

else
{		
System.out.print('0');
}
		}
System.out.println("");
	}




}
}