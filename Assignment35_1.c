// Write a program which accepts string from user and count number of capital characters.

#include<stdio.h>

int CountCapital(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if((*str >= 'A') && (*str <= 'Z'))
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

    iRet = CountCapital(Arr);

    printf("Number of capital characters in string are: %d\n",iRet);

    return 0;
}