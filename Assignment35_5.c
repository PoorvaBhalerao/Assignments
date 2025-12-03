// Write a program which accept string display it in reverse order
#include<stdio.h>

void Reverse(char *str)
{
    char *temp = str;

    while(*str != '\0')
    {
        str++;
    }

    str--;
    while(str >= temp)
    {
        printf("%c",*str);
        str--;
    }
    printf("\n");
}

int main()
{
    char Arr[] = {'\0'};
    int iRet = 0;

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    Reverse(Arr);

    return 0;
}