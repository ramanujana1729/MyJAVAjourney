/* SWITCH CASE IN JAVA */

class switchcase
{
public static void main(String args[])
{
//Basic example of switch
int i =9;

switch(i)
{
  case 0:
System.out.println("Zero");
break;

  case 1:
System.out.println("One");
break;

  case 7:
System.out.println("Seven");
break;

  case 9:
System.out.println("Nine");
break;

  default:
System.out.println("Any Number");
break;

}

//Switch Case with Strings (This can't be done in C)

String s="Hi";

switch(s)
{
    case "Hi":
  System.out.println("Hi");
break;

case "Hello":
System.out.println("Hello");

} 

}
}