class A
{
void read()
{
System.out.println("from class A");
}
}
class B extends class A
{
void read2()
{
System.out.println("from class B");
}
}
class C extends class A
{
void read3()
{
System.out.println("from class C");
}
}
class D extends class A
{
void read4()
{
System.out.println("from class D");
}
}
class H
public static void main(String args[])
{
D d=new D();
C x=new C();
B v=new B();
}
}
