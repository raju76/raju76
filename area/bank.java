class bank
{
int acno,cno;
float balance;
void create()
{
acno=10001;
cno=12345;
balance=20000;
}
void display()
{
System.out.println("cout no="+cno);
System.out.println("account no="+acno);
System.out.println("balance="+balance);
}
void deposit(float amt)
{
balance=balance+amt;
{
void withdrawl(float amt)
{
if(balance-amt>=1000)
{
balance=balance=amt;
}
else
System.out.println("main balance insufficient");
}
}
class demo
{
public static void main(String argv[])
{
bank c=new bank();
c.create();
float amt=10000;
c.deposit(amt);
System.out.println("after deposite...");
c.display();
amt=20000;//29500;
c.withdraw(amt);
System.out.println("after withdrawl...");
c.display();
}
}

