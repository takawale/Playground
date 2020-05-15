#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x1,x2,x3,y1,y2,y3;
  float x, y; 
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x=(x1+x2+x3)/3;
  y=(y1+y2+y3)/3;
  std::cout<<x<<"\n"<<y; 
}