// Write a program which accept string from user and count no of white spaces
#include<stdio.h>

int Count(char *str)
{
    int iCount = 0;
    
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
            
        }
        str++;
    }

    return iCount;
}

int main()
{
    char Arr[] = {'\0'};
    int iRet = 0;

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    iRet = Count(Arr);
    
    printf("Count of White spaces are: %d\n",iRet);

    return 0;
}