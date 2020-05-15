#include<iostream>
using namespace std;
int type(int n,int *arr)
{
 int ev=0,od=0;
 for(int i=0;i<n;i++)
 {
  if(arr[i]%2==0)
   ev++;
  else
   od++;
 }
 if(ev==n)
  return 1;
 else if (od==n)
  return 2;
 return 3;
}
int main()
{
  //Type your code here.
  int n,res;
std::cout<<"Enter the number of elements in the array\n";
std::cin>>n;
int arr[n];
std::cout<<"Enter the elements in the array\n";
for(int i=0;i<n;i++)
 std::cin>>arr[i];
res=type(n,arr);
if(res==1)
 std::cout<<"The array is Even";
else if(res==2)
 std::cout<<"The array is Odd";
else
 std::cout<<"The array is Mixed";
}