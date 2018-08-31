class Test
{
public static void main(String args[])
{
Test t1=new Test();
Test t2=new Test();
t1=null;
System.gc();
t2=null;
Runtime.getRuntime().gc();
}
protected void finalize()
{
System.out.println("G.C called");
}
}
