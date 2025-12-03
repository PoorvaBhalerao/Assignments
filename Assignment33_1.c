// Accept character from user and check whether it is alphabet or not

#include<stdio.h>
#include<stdbool.h>

bool ChkAlpha(char ch)
{
    bool bFlag = false;

    if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
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
    
    bRet = ChkAlpha(ch);

    if(bRet == true)
    {
        printf("It is an alphabet\n");
    }
    else
    {
        printf("It is not an alphabet\n");
    }

    return 0;
}