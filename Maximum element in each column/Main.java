#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,elder=0;
std::cin>>m>>n;
int arr[m][n];
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
  std::cin>>arr[i][j];
}
for(int i=0;i<n;i++)
{
 for(int j=0;j<m;j++)
 {
  if(elder<arr[j][i])
   elder=arr[j][i];
 }
 std::cout<<elder<<"\n";
 elder=0;
}

}