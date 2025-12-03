// Write a program which accepts string from user and count number of small characters.

#include<stdio.h>

int CountSmall(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
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

    iRet = CountSmall(Arr);

    printf("Number of small characters in string are: %d\n",iRet);

    return 0;
}