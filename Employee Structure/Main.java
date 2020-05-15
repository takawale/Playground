#include<iostream>
using namespace std;
struct employeewithname
 {
  string name,id,designation;
  int age;
  int salary;
  void print()
   {
    std::cout<<"Name of the Employee : "<<name<<"\n"
      <<"ID of the Employee : "<<id<<"\n"
      <<"Age of the Employee : "<<age<<"\n"
      <<"Designation of the Employee : "<<designation<<"\n"
      <<"Salary of the Employee : "<<salary;
   }
 };
int main()
{
  //Type your code here.
  employeewithname e;
std::cout<<"Enter name:\n";
std::cin>>e.name;
std::cout<<"Enter ID:\n";
std::cin>>e.id;
std::cout<<"Enter age:\n";
std::cin>>e.age;
std::cout<<"Enter designation:\n";
std::cin>>e.designation;
std::cout<<"Enter Salary:\n";
std::cin>>e.salary;
std::cout<<"Employee Details\n";
e.print();
}