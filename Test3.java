class Operation
{
int data=50;
void change(int data)
{
data=data+100;
}
public static void main(String args[])
{
Operation o=new Operation();
System.out.println("before change"+o.data);
o.change(500);
System.out.println("after change"+o.data);
}
}
