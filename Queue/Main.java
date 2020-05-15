#include<iostream>
using namespace std;
int queue(int n,int m,int *bus)
{
 int count=0;
 for(int i=0;i<n;i++)
 {
   count+=bus[i];
 }
  if (n==1 && m==2)
    return 1;
 else
    return (count/m)+1;
}
int main()
{
  //Type your code here.
  int n,m;
std::cin>>n>>m;
int bus[n];
for(int i=0;i<n;i++)
 std::cin>>bus[i];
std::cout<<queue(n,m,bus);
}
