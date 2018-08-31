class arthematic
{
int n1,n2;
int add()
{
int c=n1+n2;
return(c);
}
int diff()
{
int c=n1-n2;
return(c);
}
int product()
{
return(n1*n2);
}
int coeff()
{
return(n1/n2);
}
int remainder()
{
return(n1%n2);
}
void assign()
{
n1=10;
n2=5;
}
};
class test
{
public static void main(String args[])
{
arthematic p=new arthematic();
p.assign();
int s=p.add();
int d=p.diff();
int pd=p.product();
int c=p.coeff();
int r=p.remainder();
System.out.println("sum="+s);
System.out.println("diffence="+d);
System.out.println("product="+pd);
System.out.println("coeff="+c);
System.out.println("remainder="+r);
}
}
