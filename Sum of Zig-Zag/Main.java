#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,sum=0;
std::cin>>m>>n;
int arr[m][n],row[m];
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
  std::cin>>arr[i][j];
  if(i==0 || i==m-1 ||(i+j==m-1))  
   sum+=arr[i][j];
 }
}
std::cout<<"Sum of Zig-Zag pattern is "<<sum;

}