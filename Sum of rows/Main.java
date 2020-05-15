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
 sum=0;
 for(int j=0;j<n;j++)
 {
  std::cin>>arr[i][j];
  sum+=arr[i][j];
 }
row[i]=sum;
}
for(int i=0;i<m;i++)
 std::cout<<row[i]<<"\n";

}