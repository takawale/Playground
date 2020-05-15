#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char childstr[50],actstr[50];
int i,len=0;
bool isbool=1;
std::cin.getline(actstr,50);
std::cin.getline(childstr,50);
len=strlen(actstr);
for(i=0;i<len;i++)
{
 if(actstr[i]!=childstr[len-1-i])
  isbool=0;
}
if(isbool)
 std::cout<<"It is correct";
else
 std::cout<<"It is wrong";

}