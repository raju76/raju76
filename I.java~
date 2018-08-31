class A
{
void fun1()
{
System.out.println("from fun1");
}
B b=new B();
b.fun2();
System.out.println("x=" + b.x);
void fun3()
{
System.out.println("from fun3");
}
}
class B
{
int x;
void fun2()
{
System.out.println("from fun2");
b.fun3();
}
}
class C
{
void fun3()
{
System.out.println("from external fun3");
}
}
class Demo
{
public static void main(String args[])
{
A a=new A();
a.fun1();
C z=new C();
z.fun3();
}
}



