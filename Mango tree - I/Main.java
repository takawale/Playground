#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,num;
  std::cin>>r>>c>>num;
  if (num<=r*c && (num<=c || (num%c==0 || num%c==1)))
    std::cout<<"Yes";
  else
    std::cout<<"No";
}