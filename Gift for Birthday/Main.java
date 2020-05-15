#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int year;
  std::cin>>year; 
  if ((year%4==0 && year%100!=0) || year%400==0)
         std::cout<<year<<" is a leap year";
  else
    std::cout<<year<<" is not a leap year";
}