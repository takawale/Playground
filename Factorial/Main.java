#include<iostream>
int fact(int n)
{
  if(n==0)
    return 1;
  else
    return(n*fact(n-1));
}
int main()
{
  //Type your code here.
  int n,res;
  std::cin>>n;
  res=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<res;
}