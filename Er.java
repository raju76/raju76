class Error
{
public static void main(String args[])
{
int a=10,b=5,c=5,x,y;
int i[]={5,10},j=5,k;
try
{
x=a/(b-c);
k=i[2]/(j-i[1]);
}
catch(ArithmeticException e)
{
System.out.println("division by zero");
}
catch(ArrayIndexOutOfBoundsException p)
{
System.out.println("Array index error");
System.out.println("p.getmessage()");
}
}
}
