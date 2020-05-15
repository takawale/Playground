#include <iostream>
int main() 
{
	// Type your code here
  int n,rev;
  std::cin>>n;
  while(n>0)
  {
    rev=rev*10+n%10;
    n=n/10;
  }
  std::cout<<rev;
	return 0;
}