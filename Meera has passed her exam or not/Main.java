#include<iostream>
int main()
{
  // Type your code here
  int n,hernum;
  std::cin>>n;
  int num[n];
  bool isbool=0;
  for(int i=0;i<n;i++)
    std::cin>>num[i];
  std::cin>>hernum;
  for(int i=0;i<n;i++)
    if (hernum==num[i])
      isbool=1;
  if(isbool==0)
    std::cout<<"She failed";
  else
    std::cout<<"She passed her exam";
}