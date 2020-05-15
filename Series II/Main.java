#include<iostream>
int main()
{
  int n,num=121;
  float i=3.25;
std::cin>>n;
while(n>0)
{
  std::cout<<num<<" ";
  num+=32*i;
  i+=1;
  n--;
}
  return 0;
}