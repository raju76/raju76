class Exception
{
int division(int a,int b) throws ArithmeticException
{
int t=a/b;
return t;
}
public static void main(String args[])
{
Exception e=new Exception();
try
{
qSystem.out.println(e.division(15,0));
}
catch(ArithmeticException x)
{
System.out.println("you should not divisible by zero");
}
}
}
