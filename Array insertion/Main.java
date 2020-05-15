#include<iostream>
using namespace std;
void printarr(int n,int *arr,int p,int num)
{
    int tmp=0;
    for(int i=p-1;i<n+1;i++)
    {
        tmp=arr[i];
        arr[i]=num;
        num=tmp;
    }
    for(int i=0;i<=n;i++)
    {
        std::cout<<arr[i]<<"\n";
    }
}

int main()
{
  //Type your code here.
  int n,p,num,arr[21];
 std::cout<<"Enter the number of elements in the array\n";
 std::cin>>n;
 std::cout<<"Enter the elements in the array\n";
 for(int i=0;i<n;i++)
  std::cin>>arr[i];
 std::cout<<"Enter the location where you wish to insert an element\n";
 std::cin>>p;
  if(p<=n)
  {
 std::cout<<"Enter the value to insert\n";
 std::cin>>num;
 std::cout<<"Array after insertion is\n";
 printarr(n,arr,p,num);
  }
  else
    std::cout<<"Invalid Input";
}