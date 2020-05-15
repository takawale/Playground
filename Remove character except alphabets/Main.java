#include<iostream>

using namespace std;
int main()
{
  //Type your code here.
  char modstr[200],actstr[200];
int i,j;
std::cin.getline(actstr,200);
for(i=0,j=0;actstr[i]!='\0';i++)
{
 if((actstr[i]>=97 && actstr[i]<=122) || (actstr[i]>=65 && actstr[i]<=90))
  {
    modstr[j]=actstr[i];
    j++;
  }
}
std::cout<<modstr;
}