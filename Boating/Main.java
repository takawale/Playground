#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sfwt,ad,ch;
  std::cin>>sfwt>>ad>>ch; 
  if(sfwt>=(ad*75 + ch*30))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}