#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int n,days=0,i;
std::cin>>n;
for(i=1;i*i<=n;i++);
i--;
days = n+1+i;
if (n==1)
  std::cout<<"1";
else
  std::cout<<days;
}