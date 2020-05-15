#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int goal,count,point=0,tmp=0;
std::cin>>goal;
while(tmp<goal)
{
  std::cin>>point;
  tmp+=point;
  count++;
}
std::cout<<"The number of turns is "<<count++;
}