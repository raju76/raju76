import java.util.Scanner;
class demo
{
public static void main(String argv[])
{
Scanner S=new Scanner(System.in);
int n;
System.out.println("enter size of array");
n=S.nextInt();
int a[]=new int[n];
System.out.println("enter "+n+" elements");
int i;
for(i=0;i<n;++i)
{
a[i]=S.nextInt();
}
int b[]=a.clone();
System.out.println("elements of array a");
for(i=0;i<n;++i)
{
System.out.println(" "+a[i]);
}
System.out.println("elements of b");
for(i=0;i<n;++i)
{
System.out.println(" "+b[i]);
}
}
}
