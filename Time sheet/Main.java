#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sa;
int tot=0,hrs;
std::cin>>s>>m>>t>>w>>th>>f>>sa;
hrs=m+t+w+th+f;
tot=(100*(m+t+w+th+f+(1.25*sa)+(1.5*s)));
if(hrs > 40)
 {
   tot+=125*(hrs-40);
 }
if(m>8)
 tot+=15*(m-8);
if(t>8)
 tot+=15*(t-8);
if(w>8)
 tot+=15*(w-8);
if(th>8)
 tot+=15*(th-8);
if(f>8)
 tot+=15*(f-8);
std::cout<<tot;

}