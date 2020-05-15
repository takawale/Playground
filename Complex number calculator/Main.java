#include<iostream>
struct complex{
  int a;
  int b;
};
void add(complex c1,complex c2)
{
  int a = c1.a + c2.a;
  int b = c1.b + c2.b;
  if (b>=0)
    std::cout<<a<<"+"<<b<<"i";
  else
    std::cout<<a<<b<<"i";
}
void sub(complex c1,complex c2)
{
  int a = c1.a - c2.a;
  int b = c1.b - c2.b;
  if (b>=0)
    std::cout<<a<<"+"<<b<<"i";
  else
    std::cout<<a<<b<<"i";
}
void mul(complex c1,complex c2)
{
  int a = (c1.a * c2.a)-(c1.b * c2.b);
  int b = (c1.a * c2.b) + (c1.b * c2.a);
  if (b>=0)
    std::cout<<a<<"+"<<b<<"i";
  else
    std::cout<<a<<b<<"i";
}
int main()
{
  complex c1,c2;
  int op;
  std::cin>>op;
  std::cin>>c1.a>>c1.b>>c2.a>>c2.b;
  switch (op)
  {
    case 1:add(c1,c2);
           break;
    case 2:sub(c1,c2);
           break;
    case 3:mul(c1,c2);
           break;
    default:
      std::cout<<"Invalid choice";
  }
}