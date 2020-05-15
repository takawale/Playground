#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
std::cin>>n;
for(int i=1;i<=n;i++)
{
 for(int j=1;j<=n;j++)
 {
  if(((i%2!=0) && (j==n)) || ((i%2==0) && (j==1)) )
    std::cout<<i+1;
  else
    std::cout<<i;
 }
 std::cout<<"\n";
}
    return 0;
}