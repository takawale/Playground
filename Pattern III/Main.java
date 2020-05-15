#include<iostream>
int main()
{
  int n,k=0,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i+k;j++)
    {
 	  if(j%2!=0)
 	    std::cout<<i;
 	  else
 		std::cout<<"*";
	}
  std::cout<<"\n";
  if(i==n)
 	break;
  k++; 
  }

for(i=n;i>=1;i--)
{
for(j=1;j<=i+k;j++)
{
 if(j%2!=0)
 std::cout<<i;
 else
 std::cout<<"*";
}
std::cout<<"\n";
k--; 
}
}