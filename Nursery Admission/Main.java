#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.  
char childstr[50];
std::cin.getline(childstr,50);
std::cout<<"The number of letters in the name is "<<strlen(childstr);
}