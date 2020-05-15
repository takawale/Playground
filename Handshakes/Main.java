#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i=1,num,tot=0;
  std::cin>>num;
  for(i=1;i<num;i++)
  {
    tot+=i;
  }
  std::cout<<tot;
}