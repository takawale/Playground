#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,i=0;
std::cin>>num;
while(num!=1)
{
	
	std::cout<<num<<"\n";
	if (num%2==0)
		num=num/2;
	else
		num=3*num+1;
	i++;
}
std::cout<<num<<"\n"<<i;
}