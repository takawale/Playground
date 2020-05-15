#include<iostream>
using namespace std;
struct timediff
{
 int hrs,min,sec;
 void print()
 {
  std::cout<<hrs<<":"<<min<<":"<<sec;
 }
};
void diff(timediff t1,timediff t2,timediff *t3)
 {
  if(t2.sec > t1.sec)
    {
        --t1.min;
        t1.sec += 60;
    }

    t3->sec = t1.sec - t2.sec;
    if(t2.min > t1.min)
    {
        --t1.hrs;
        t1.min += 60;
    }
    t3->min = t1.min-t2.min;
    t3->hrs = t1.hrs-t2.hrs;

 }

int main()
{
  //Type your code here
timediff t1,t2,t3;
std::cin>>t1.hrs>>t1.min>>t1.sec;
std::cin>>t2.hrs>>t2.min>>t2.sec;
diff(t1,t2,&t3);
t3.print();
}