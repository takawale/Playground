#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
    char str[100];
    int count = 0, i; 
    std::cin.getline(str,100);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
  if(count+1 <=10)
    std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
}