#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  std::cin>>age>>time;
  if (age>13)
  {
    if (time==13.30f)
      std::cout<<"$5.00";
    else
      std::cout<<"$8.00";
  }
  else
  {
    if (time==13.30f)
      std::cout<<"$2.00";
    else
      std::cout<<"$4.00";
  }
}