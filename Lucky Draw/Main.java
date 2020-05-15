#include<iostream>
int main()
{
  int num,count=0;
  std::cin>>num;
  for(int i=2;i<=num/2;i++)
  {
    if (num%i==0)
    {
      count=1;
      break;
    }
  }
  if(count==1 || num==1)
    std::cout<<"Not eligible";
  else 
    std::cout<<"Eligible";
}