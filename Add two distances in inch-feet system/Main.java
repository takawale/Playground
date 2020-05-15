#include<iostream>
using namespace std;
struct Addlen
{
 int feet;
 float inch;
 void print()
 {
  std::cout<<feet<<"\'-"<<inch<<"\"";
 }
};
void Add(Addlen l1,Addlen l2,Addlen *tot)
{
 tot->feet = l1.feet + l2.feet;
 tot->inch = l1.inch + l2.inch;
 if (tot->inch > 12.0)
  {
    tot->inch -=12.0;
    tot->feet++;
  }
}
int main()
{
  //Type your code here.
  Addlen l1,l2,tot;
std::cin>>l1.feet>>l1.inch>>l2.feet>>l2.inch;
Add(l1,l2,&tot);
tot.print();

}