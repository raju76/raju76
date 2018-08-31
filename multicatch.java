import java.lang.*;
class error4
{
public static void main(String args[])
{
int a[]={5,10};
int b=5;
try
{
int x=a[2]/b-a[1];
}
catch(Arithmetic Exception e)
{
System.out.print("division by zero");
}
catch(File Not found exception e)
{
System.out.print("file not found");
}
catch(Array Index out of Bounds Exception e)
{
System.out.print("Array Index error");
System.out.print("e.get message()");
}
int v=a[1]/a[0]
