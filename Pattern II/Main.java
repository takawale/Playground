#include<iostream>
int main()
{
 int n,num=1,tmp;
 std::cin>>n;
 for(int i=1;i<=n;i++)
 {
     tmp=num;
  for(int j=1;j<=i*2-1;j++)
  {
   if(j%2==0)
   std::cout<<"*";
   else
   {
    std::cout<<tmp;
    if(i%2==0)
    tmp--;
    else
    tmp++;
   }
  }
  std::cout<<"\n";
  if(i%2==0)
  num++;
  else
  num+=2*i;
 }
}