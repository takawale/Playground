#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p, y, r;
  float si, amt, dis, disamt; 
  std ::cin>>p>>y>>r; 
  si=(p*y*r)/100;
  amt=p+si;
  dis =0.02*si; 
  disamt =amt-dis;
  std::cout<<si<<"\n"<<amt<<"\n"<<dis<<"\n"<<disamt;
}