#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil; 
  int lt,d; 
  std::cin>>mil>>lt>>d; 
  if (mil*float(lt)>=float(d))
    std::cout<<"Can reach";
  else 
    std::cout<<"Cannot reach";
}