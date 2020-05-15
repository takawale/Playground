#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int ip, op; 
  std::cin>>ip; 
  op=(ip%10)+(ip/1000);
  std::cout<<op; 
}