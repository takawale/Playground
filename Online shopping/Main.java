#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fp,fd,fsh,sp,sd,ssh,ap,ad,ash; 
  std::cin>>fp>>fd>>fsh>>sp>>sd>>ssh>>ap>>ad>>ash; 
  int ftot,stot,atot; 
  ftot=fp-(fd*fp/100)+fsh;
  stot=sp-(sd*sp/100)+ssh;
  atot=ap-(ad*ap/100)+ash; 
  std::cout<<"In Flipkart Rs."<<ftot<<"\n"<<"In Snapdeal Rs."<<stot<<"\n"
    <<"In Amazon Rs."<<atot<<"\n";
  if (ftot<=stot && ftot<=atot)
    std::cout<<"He will prefer Flipkart";
  else if (stot<=atot) 
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
}