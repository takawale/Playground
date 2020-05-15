#include<iostream>
int main()
{
  int num1,num2;
  std::cin>>num1>>num2;
  if (num1>num2)
    std::cout<<num2<<" is smallest number";
  else
    std::cout<<num1<<" is smallest number";
}