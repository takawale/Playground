#include<iostream>
int exp(int m,int n,int req)
{
  int num=1;
  for(int i=0;i<n;i++)
    num*=m;
  if (num>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  exp(m,n,req);
}