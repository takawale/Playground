#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
      int totball,totrun,run,ball;
  int totovers;
  float overfin,cur_runrate,tot_runrate; 
  std::cin>>totball>>totrun>>run>>ball; 
  
  totovers=totball/6;
  overfin=ball/6 + 0.1*(ball%6);
  cur_runrate=int(run/overfin*10+0.5)*0.1;
  
  tot_runrate=int(totrun/float(totovers)*10+0.5)*0.1;
  
  std::cout<<totovers<<"\n"<<overfin<<"\n"<<cur_runrate<<"\n"<<tot_runrate<<"\n";
  if(cur_runrate>=tot_runrate)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";
}