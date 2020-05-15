#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int arr1[r][c],arr2[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>arr1[i][j];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>arr2[i][j];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      std::cout<<arr1[i][j]+arr2[i][j]<<" ";
  std::cout<<"\n";
  }
}