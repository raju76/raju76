import java.util.*;
class matmulti
{
public static void main(String args[])
{
int i,j,k;
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
Scanner s=new Scanner(System.in);

System.out.print("enter matrix A elements");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=s.nextInt();
}
}

System.out.print("enter matrix B elements");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=s.nextInt();
}
}

System.out.print("matrix multiplication");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=0;
for(k=0;k<3;k++)
{
c[i][j]+=a[i][k]*b[j][k];
}
}
}

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}

