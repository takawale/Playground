#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student s1;
  std::cin.getline(s1.name,50);
  std::cin>>s1.roll>>s1.marks;
  std::cout<<"\nStudent Details"<<"\nName: "<<s1.name<<"\nRoll: "<<s1.roll
    <<"\nMarks: "<<s1.marks;
}