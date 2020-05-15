#include<iostream>
int gcd(int a,int b)
{
  int tmp;
if(a<b)
{
 tmp=a;
 a=b;
 b=tmp;
}
  if (b == 0) 
        return a; 
    return gcd(b, a % b);
}
int main()
{
  int a,b,res;
  std::cin>>a>>b;
  res=gcd(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<res;
}