#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      std::cin>>arr[i][j];
  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
      std::cout<<arr[j][i]<<" ";
    std::cout<<"\n";
  } 
}