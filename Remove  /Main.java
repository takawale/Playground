#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string ip,word="the ";
  std::getline(std::cin,ip);
  int found=-1;
  do
  {
    found = ip.find(word,found+1);
    if(found!=-1)
    {
      ip = ip.substr(0,found) + ip.substr(found+word.length());
    }
  }while(found!=-1);
  std::cout<<ip;
}