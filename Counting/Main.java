#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char actstr[200];
int i=0,vow=0,con=0,whitspac=0,dig=0,spch=0;    
std::cin.getline(actstr,200);
for(i = 0; actstr[i] !='\0'; i++)
{
  if (actstr[i] == 'a' || actstr[i] == 'e' || actstr[i] == 'i' ||
            actstr[i] == 'o' || actstr[i] == 'u' || actstr[i] == 'A' ||
            actstr[i] == 'E' || actstr[i] == 'I' || actstr[i] == 'O' ||
            actstr[i] == 'U') 
   vow+=1;
  else if((actstr[i] >='a' && actstr[i] <= 'z') || (actstr[i] >='A' && actstr[i] <='Z'))
   con+=1;
  else if(actstr[i] == ' ')
   whitspac+=1;
  else if((actstr[i] >= '0' ) && (actstr[i]<='9'))
   dig+=1;
  else
   spch+=1;
}
std::cout<<"Vowels:"<<vow<<"\nConsonants:"<<con<<"\nWhite Spaces:"<<whitspac<<"\nDigits:"<<dig<<"\nSymbols:"<<spch;
}