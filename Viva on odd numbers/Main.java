#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,odd=0;
float score=0;
do
{
  std::cin>>num;
  if (num<0)
  {
    score=score-1;
    break;
  }
  if (num%2==0)
    score=score-0.5;
  else
    {
      score=score+1;
      odd++;
    }
  
}while(odd<3);
std::cout<<score;
}