//In Java we can use '$' sign,'_' & 'a-z' & 'A-Z' 
//As Variable Name.
//You can even use numbers but the first place cannot 
//have a number
public class Variables
{
public static void main(String args[])
{

int $abc_ = 56;
//In Java by default it is double so while writing float u //need to mention 'f' at the end
float _xyz = 4.4f;

double gg = 4.4; 

int i=5;   //4 bytes -> 32 bits
short s=5;  // 2 bytes -> 16 bits -> -32768 to 32767
byte b =5;  // 1 byte -> 8 bits -> -128 to 127

double d1 = 5;  //implicit conversion
int k = (int)5.6;  // type casting

//Again when using long speciy 'l' at the end
long l = 50000000000000000l;

System.out.println($abc_);
System.out.println(_xyz);
System.out.println(gg + "  "+ i + b + k);

}
}