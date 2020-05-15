#include<iostream>
#include<iomanip>
using namespace std;
struct student
 {
  char name[30], department[20];
  int yearofstudy;
  float cgpa; 
 };
void print(student s)
   {
    std::cout<<"Name:"<<s.name<<"\n"
      <<"Department:"<<s.department<<"\nYear of study:"<<s.yearofstudy<<"\n";
    std::cout<<"CGPA:"<<setprecision(2)<<s.cgpa<<"\n";
   }
int main()
{
  //Type your code here.
  int n,i=0,j=0;
std::cout<<"Enter the number of students\n";
std::cin>>n;
student s[n],temp;
while(i<n)
 {
  std::cout<<"Enter the details of student "<<i+1<<"\nEnter name\n";
  std::cin>>s[i].name;
  std::cout<<"Enter department\n";
  std::cin>>s[i].department;
  std::cout<<"Enter year of study\n";
  std::cin>>s[i].yearofstudy;;
  std::cout<<"Enter cgpa\n";
  std::cin>>s[i].cgpa;
  i++;
 }
  for(i=0;i<n-1;i++)
 {
  for(j=i+1;j<n;j++)
   {
     string n1=s[i].name,n2=s[j].name;
     if(n1>n2)
      {
       temp = s[i];
       s[i] = s[j];
       s[j] = temp;       
      }
   }
 }
  std::cout<<"Details of students\n";
for(i=0;i<n;i++)
{
  std::cout<<"Student "<<i+1<<"\n";
 print(s[i]);
}
}