#include<iostream>
int main()
{
  // Type your code here
  int num,count;
  std::cin>>num;
  do
  {
    count++;
    num=num/10;
  }while(num!=0);
  std::cout<<count;
}