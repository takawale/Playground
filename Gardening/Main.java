#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c,r,num; 
  std::cin>>r>>c>>num; 
  if ((num>r && num<=2*r) || (num<=r*c-r && num>r*(c-2)))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}