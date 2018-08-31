class A
{
A()
{
System.out.println("default construtor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class Test
{
public static void main(String args[])
{
A a=new A(1,2);
a.display();
}
} 
