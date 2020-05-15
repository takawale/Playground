#include<iostream>
int main()
{
  int num;
std::cin>>num; 
int dash;       
int i, j, lterm, rterm; 
lterm = 1;  
rterm = num * num + 1; 
for (i = num; i > 0; i--)
{ 
 for (dash = num; dash > i; dash--) 
  std::cout << "--"; 
 for (j = 1; j <= i; j++)
 { 
  std::cout << lterm; 
  std::cout << "*"; 
  lterm++; 
 } 
 for (j = 1; j <= i; j++)
 { 
  std::cout << rterm; 
  if (j < i) 
   std::cout<<"*"; 
  rterm++; 
 } 
 rterm = rterm - (i - 1) * 2 - 1; 
 std::cout <<"\n"; 
}
}