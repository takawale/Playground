#include<iostream>
#include<cstring>
int main()
{
    char a[50][50];
    int i=0,n = 0;
    while(1)
    {
        std::cin.getline(a[i],50);
        if(!strcmp(a[i],"####"))
            break;
	n++;
	i++;
    }
    std::cout <<a[0]<<"\n";
    for(i = 0; i < n; i++)
    {
        if(a[i][strlen(a[i])-1]==a[i+1][0])
            std::cout<< a[i+1] <<"\n";
    }
    return 0;
}





