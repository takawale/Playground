#include<iostream>
int sumofdigit(int n)
{
 if (n == 0)
      return 0;
 return n%9==0?9:n%9;
}

int main()
{
 int n;
 std::cin>>n;
 std::cout<<sumofdigit(n);
}