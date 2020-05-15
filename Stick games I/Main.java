#include<iostream>
using namespace std;
void print(int &p)
{
   if(p % 2 == 0)
        std::cout<<"Mani Iyer";
    else
        std::cout<< "Arun Gupta";
}
int main()
{
  //Type your code here.
    int n, m, res;
    std::cin>>n>> m;
    if(n < m)
        res = n;
    else
        res = m;
  	print(res);
    return 0;
}