import java.io.*;
class bsort
{
public static void main(String argv[])
{
int a[]={72,64,29,33,42,67};
int temp,i,p;
for(p=1;p<a.length;++p)
{
for(i=0;i<a.length-p;++i)
{
if(a[i]>a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}
}
}
System.out.println("sorted array");
for(i=0;i<a.length;++i)
{
System.out.println(a[i]);
}
}
}
