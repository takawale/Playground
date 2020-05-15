#include<iostream>
int main()
{
  int n,tmp=1,num=6;
std::cin>>n;
while(tmp<=n)
{
  std::cout<<num<<" ";
  num=num+5*tmp;
  tmp++;
}
}