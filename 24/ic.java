import java.lang.*;
class A
{
void fun1()
{
System.out.println("hello function1");
B obj=new B();
obj.x=10;
System.out.println("x="+obj.x);
obj.fun2();
}
void fun3()
{
System.out.println("hello fun3");
}
class B
{
int x;
void fun2()
{
System.out.println("hello fun2");
fun3();
}
}
} 
class c
{
void fun3()
{
System.out.println("hello fun3");
}
}
class IncDemo
{
public static void main(String args[])
{
A a=new A();
a.fun1();
c y=new c();
y.fun3();
}
}
