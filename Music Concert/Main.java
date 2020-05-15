#include<iostream>
int main(){
  // Type your code here
  int n;
std::cin>>n;
int *ptr = NULL,i=0,ev=0;
ptr = (int*) malloc(n*sizeof(int));
for(i=0;i<n;i++)
 {
  std::cin>>*(ptr+i);
  if (*(ptr+i)%2 != 0)
   ev+=1;
 }
std::cout<<ev<<"\n"<<n-ev;
  free(ptr);
  return 0;
}