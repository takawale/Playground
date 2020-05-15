#include<iostream>
int main()
{
  int num1,num2,sum,i=1,tot=0;
  std::cin>>num1>>num2;
  sum = num1 + num2;
  for(i=1;i<=sum/2;i++)
  {
    if (sum%i==0)
      tot+=i;
  }
  if (tot==sum)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}