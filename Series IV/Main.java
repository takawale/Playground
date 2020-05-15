#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,num=0,mul=1,count=0;
std::cin>>n;
while(count!=n)
{
 if(count==0)
  std::cout<<num<<" "; 
 else
 {
  num+=2*mul;
  std::cout<<num<<" ";
  if(count%2!=0)
   mul+=2;
 }
count++;
}
}