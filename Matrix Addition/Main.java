#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,sum=0;
std::cin>>m>>n;
int arr1[m][n],arr2[m][n];
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
  std::cin>>arr1[i][j];
 }
}
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
  std::cin>>arr2[i][j];
 }
}
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
  std::cout<<arr1[i][j] + arr2[i][j]<<" ";
 }
std::cout<<"\n";
}

}