class test
{
int a;
void read()
{
a=10;
}
void write()
{
System.out.println("values of a "+a);
}
}
class demo
{
public static void main(String args[])
{
test p= new test();
p.read();
p.write();
}
}
