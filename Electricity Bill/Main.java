#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit; 
  std::cin>>unit; 
  if (unit<=200)
    std::cout<<"Rs."<<int(unit*0.5);
  else if (unit<=400)
    std::cout<<"Rs."<<int(unit*0.65)+100;
  else if (unit<=600)
    std::cout<<"Rs."<<int(unit*0.8)+200;
  else
    std::cout<<"Rs."<<int(unit*1.25)+425;
}