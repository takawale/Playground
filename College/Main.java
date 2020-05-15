#include<iostream>
using namespace std;
struct College 
 { 
   char name[100],city[100]; 
   int establishmentYear; 
   float passPercentage; 
   void print()
    {
     std::cout<<"Name:"<<name<<"\n"<<"City:"<<city<<"\n"
      <<"Year of establishment:"<<establishmentYear<<"\n"
      <<"Pass percentage:"<<passPercentage<<"\n";
    }
 }; 

int main()
{
  //Type your code here.
  int n,i=0,j=0;
std::cout<<"Enter the number of colleges\n";
std::cin>>n;
College c[n],temp;
while(i<n)
 {
  std::cout<<"Enter the details of college "<<i+1<<"\n";
  std::cout<<"Enter name\n";
  std::cin>>c[i].name;
  std::cout<<"Enter city\n";
  std::cin>>c[i].city;
  std::cout<<"Enter year of establishment\n";
  std::cin>>c[i].establishmentYear;
  std::cout<<"Enter pass percentage\n";
  std::cin>>c[i].passPercentage;
  i++;
 }
for(i=0;i<n-1;i++)
 {
  for(j=i+1;j<n;j++)
   {
     string n1=c[i].name,n2=c[j].name;
     if( n1> n2)
      {
       temp = c[i];
       c[i] = c[j];
       c[j] = temp;       
      }
   }
 }
std::cout<<"Details of colleges\n";
for(i=0;i<n;i++)
 {
  std::cout<<"College:"<<i+1<<"\n";
  c[i].print();
 }


}