#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string str;
  std::getline(std::cin,str);
  int n = str.length(); 
    for (int i = 0; i < n / 2; i++) 
        std::swap(str[i], str[n - i - 1]); 
  std::cout<<str;
}