#include<iostream>
int main()
{
  // Type your code here
  int n,highest=0;
  std::cin>>n;
  int mark[n];
  for(int i=0;i<n;i++)
    std::cin>>mark[i];
  for(int i=0;i<n;i++)
    if(highest<mark[i])
      highest=mark[i];
  std::cout<<highest;
}