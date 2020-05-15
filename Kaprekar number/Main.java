#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,tmp,res=1,count;
std::cin>>num;
tmp=num;
while(num!=0)
{
  res*=10;
  num/=10;
}
num=tmp;
tmp*=tmp;
count=tmp%res;
tmp/=res;
if(num==(count+tmp))
  std::cout<<"Kaprekar Number";
else
  std::cout<<"Not a Kaprekar Number";
}