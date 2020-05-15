#include<iostream>
int fibo(int n)
{
  if(n<=2)
    return n-1;
  return fibo(n-1)+fibo(n-2);
}
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n);
}