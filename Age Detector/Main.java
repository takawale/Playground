#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year1,year2;
  std::cin>>year1>>year2;
  if (year2>year1)
    std::cout<<year2-year1;
  else
    std::cout<<year2+100-year1;
}