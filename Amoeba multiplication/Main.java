#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,t1=0,t2=1,sum;
std::cin>>num;
while(num>2)
{
	sum=t1+t2;
  	t1=t2;
	t2=sum;
	num--;
}
if(num==1)
	std::cout<<t1;
else
	std::cout<<t2;
}