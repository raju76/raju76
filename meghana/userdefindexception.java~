import java.lang.*;
class myException extends Throwable
{
String s1;
myException(String s2)
{
s1=s2;
}
public String toString()
{
return("my Exception occured"+s1);
}
}
class TestException
{
public static void main(String args[])
{
try
{
System.out.println("starting of try block");
throw new myException("this is error message");
}
catch(myException e)
{
System.out.print("catch block");
System.out.print(e);
}
}
}

