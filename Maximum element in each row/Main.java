#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,max;
std::cin>>m>>n;
int arr[m][n];
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
  std::cin>>arr[i][j];
}
for(int i=0;i<m;i++)
{
 max=0;
 for(int j=0;j<n;j++)
 {
  if(max<arr[i][j])
   max=arr[i][j];
 }
 std::cout<<max<<"\n";
}
}