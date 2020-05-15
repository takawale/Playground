#include<iostream>
int main(){
  // Type your code here
  int n,fac=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    fac*=i;
  }
  std::cout<<fac;
}