#include<iostream>
int main()
{
  int n;
float tmp=0.5;
std::cin>>n;
while(n>0)
{
 std::cout<<tmp<<" ";
 tmp*=3;
 n--;
}
}