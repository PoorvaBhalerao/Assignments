// Write a program to accept a string and accept on character and check whether that character is present in string or not

#include<stdio.h>
#include<stdbool.h>

bool Search(char *str, char ch)
{
    bool bFlag = false;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            bFlag = true;
            break;
        }
        str++;
    }
    return bFlag;
}

int main()
{
    char Arr[] = {'\0'};
    bool bRet = false;
    char cValue = '\0';

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter a character: \n");
    scanf(" %c",&cValue);

    bRet = Search(Arr, cValue);
    
    if(bRet == true)
    {
        printf("%c is present\n",cValue);
    }
    else
    {
        printf("%c is not present\n",cValue);
    }

    return 0;
}