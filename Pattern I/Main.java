#include<iostream>
int main()
{
  int n,i,k;
std::cin>>n;
for(i=1;i<=4;i++)
{
  for(k=1;k<=i;k++)
  {
    std::cout<<n;
  }
  n++;
  std::cout<<"\n";
}
  n--;
for(i=4;i>=1;i--)
{
  for(k=1;k<=i;k++)
  {
    std::cout<<n;
  }
  n--;
  std::cout<<"\n";
}
}