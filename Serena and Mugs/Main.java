#include<iostream>
using namespace std;
int printresult(int *p,int n,int s)
{
 int sum=0;
 for(int i=0;i<n;i++)
  sum+=p[i];
 if(sum<=s)
  return 1;
 else 
  return 0;
}
int main()
{
  //Type your code here.
  int n,s;
std::cin>>n>>s;
int v[n];
for(int i=0;i<n;i++)
 std::cin>>v[i];
if(printresult(v,n,s))
 std::cout<<"YES";
else
 std::cout<<"NO";
}