#include<iostream>
int main()
{
  int stones; 
  std::cin>>stones; 
  (stones%2==0)?std::cout<<"Possible":std::cout<<"Not possible";
}