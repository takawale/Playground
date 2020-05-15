#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,num=121;
  float mul=3.25;
  std::cin>>n;
  while(n>0)
  {
    std::cout<<num<<" ";
    num+=32*mul;
    mul+=1;
    n--;
  }
}