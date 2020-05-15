#include <iostream>
int main()
{
char str[100], rev[100];     
int end, i;    
//Your code goes here      
  std::cin.getline(str,100);
  for(i=0;str[i]!='\0';i++);
  end=i;
  for(i=0;str[i]!='\0';i++)
    rev[i] = str[end-1-i];
  std::cout<<rev;
}