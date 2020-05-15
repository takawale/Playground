#include<iostream>
int main()
{
  int num1,num2,i;
  std::cin>>num1>>num2;
  for(;num1<=num2;num1++)
  {
    int sum=0;
    for(i=1;i<=num1/2;i++)
    {
      if(num1%i==0)
        sum+=i;
    }
    if (sum==num1)
      std::cout<<sum<<" ";
  }
}