#include<iostream>
using namespace std;
void oddeven(int *arr,int n)
{
 int odd=0,even=0;
 for(int i=0;i<n;i++)
 {
  if(arr[i]%2==0)
  even+=arr[i];
  else
  odd+=arr[i];
 }
 std::cout<<"The sum of the even numbers in the array is "<<even<<"\nThe sum of the odd numbers in the array is "<<odd;
}
int main()
{
  //Type your code here.
  int n;
std::cin>>n;
int arr[n];
for(int i=0;i<n;i++)
 std::cin>>arr[i];
oddeven(arr,n);
}