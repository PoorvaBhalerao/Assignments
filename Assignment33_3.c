// Accept character from user and check whether it is digit or not

#include<stdio.h>
#include<stdbool.h>

bool ChkDigit(char ch)
{
    bool bFlag = false;

    if((ch >= '0') && (ch <= '9'))
    {
        bFlag = true;
    }
    else
    {
        bFlag = false;
    }

    return bFlag;
}

int main()

{
    char ch = '\0';
    bool bRet = false;

    printf("Enter character :\n");
    scanf("%s",&ch);                               
    
    bRet = ChkDigit(ch);

    if(bRet == true)
    {
        printf("It is a Digit\n");
    }
    else
    {
        printf("It is not a Digit\n");
    }

    return 0;
}