class Exception
{
void checkage(int age)
{
if(age<18) 
throw new ArithmeticException("not eligible for voting");
else
System.out.println("eligible for vote");
}
public static void main(String args[])
{
Exception e=new Exception();
e.checkage(17);
}
}
