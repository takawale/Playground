#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
int num,sum=0,tmp;
std::cin>>num;
while(num!=0)
{
  tmp=num%10;
  if (tmp%2==0)
   sum+=tmp;
  else
   sum-=tmp;
  num/=10;
}
if (sum==0)
  std::cout<<"Yes";
else
  std::cout<<"No";
}