#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int dol1,cen1,dol2,cen2;
  int totdol,totcen,temp;
  std::cin>>dol1>>cen1>>dol2>>cen2;
  temp=(cen1+cen2)/100;
  totcen=(cen1+cen2)%100;
  totdol=dol1+dol2+temp;
  std::cout<<totdol<<"\n"<<totcen;
}