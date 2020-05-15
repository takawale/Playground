#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,m;
std::cin>>a>>b>>c;
if ((a>=b && a<=c)||(a<=b && a>=c))
 std::cout<<"The treasure is in box which has number "<<a;
else if ((b>=a && b<=c)||(b<=a && b>=c))
 std::cout<<"The treasure is in box which has number "<<b;
else
 std::cout<<"The treasure is in box which has number "<<c;
if (a<=b && a<=c)
  m=a;
else if (b<=a && b<=c)
  m=b;
else
  m=c;
if(a%m==0 && b%m==0 &&c%m==0)
 std::cout<<"\nThe code to open the box is "<<m;
else
 std::cout<<"\nThe code to open the box is "<<1;
}