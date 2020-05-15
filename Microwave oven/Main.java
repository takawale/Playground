#include<iostream>
#include <iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int item;
  float ti,tmp; 
  std::cin>>item>>ti;
  if(item==2)
  {
    tmp=(ti*0.5+ti); 
    std::cout<<tmp; 
  }
  else if(item==3)
  {
    tmp=(ti*2);
    std::cout<<tmp;
  }
  else if (item>3)
    std::cout<<"Number of items is more";
}
