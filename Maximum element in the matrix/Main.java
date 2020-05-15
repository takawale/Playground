#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,max=0;
std::cin>>m>>n;
int arr[m][n];
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
  std::cin>>arr[i][j];
  if(max<arr[i][j])
   max=arr[i][j];
 }
}
std::cout<<"The maximum element is "<<max;
}