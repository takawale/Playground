#include<iostream>
int gcd(int a,int b,int c)
{
  int small=0;
  if(a<b && a<c)
    small=a;
  else if(b<a && b<c)
    small=b;
  else
    small=c;
  while(small!=0)
  {
    if(a%small==0 && b%small==0 && c%small==0)
      break;
    small--;
  }
  return small;
}
int main()
{
  int num1,num2,num3,ans;
  std::cin>>num1>>num2>>num3>>ans;
  if(ans==gcd(num1,num2,num3))
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}