#include<iostream>
using namespace std;
int a=5;
int main()
{
int a=10;
{
int a=20;
cout<<"local a="<<a;
cout<<"global variable a="<<::a;
}
cout<<"a="<<a;
cout<<"a="<<::a;
return 0;
}


