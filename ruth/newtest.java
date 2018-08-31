class BaseClass
{
BaseClass()
{
System.out.println("super class constructor:");
}
BaseClass (int x)
{
System.out.println("from superclass"+x);
}
}

class SubClass extends BaseClass
{
SubClass(int a)
{
super(a);
System.out.println("default constructor ofsubclass");
}
SubClass()
{
super();
}
}

class SuperTest2
{
public static void main(String args[])
{
SubClass s=new SubClass(10);
}
}

