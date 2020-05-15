#include<iostream>
using namespace std;
int main()
{
  int a,sum1=0,sum2=0,sum3=0;
  cin>>a;
  int arr[a][a];
  for(int i=0;i<a;i++)
  {
    for (int j=0;j<a;j++)
    {
      cin>>arr[i][j];
    }
  }
  for (int i=0,j=0;i<a;i++)
  {
    sum1=arr[i][j]+sum1;
  }
  for (int i=0,j=0;j<a;j++)
  {
    sum2=arr[i][j]+sum2;
  }  
  for(int i=0;i<a;i++)
  {
    for (int j=0;j<a;j++)
    {
      if(i==j)
        sum3=sum3+arr[i][j];
    }
  }
  if(sum1==sum3)
    cout<<"Yes";
  else
    cout<<"No";
  
  
}