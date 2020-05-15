#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,tmp,sum=0;
  std::cin>>num;
  tmp=num;
  do
  {
    sum+=num%10;
    num=num/10;
  }while(num!=0);
  if(tmp%sum==0)
      std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}