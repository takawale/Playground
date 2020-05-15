#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
 char childstr[50],actstr[50];
std::cin.getline(childstr,50);
std::cin.getline(actstr,50);
if(strcmp(childstr,actstr)==0)
 std::cout<<"It is correct";
else
 std::cout<<"It is wrong";
}