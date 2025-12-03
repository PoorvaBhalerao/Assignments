// Accept character from user and check whether it is in small case or not

#include<stdio.h>
#include<stdbool.h>

bool ChkSmall(char ch)
{
    bool bFlag = false;

    if((ch >= 'a') && (ch <= 'z'))
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
    
    bRet = ChkSmall(ch);

    if(bRet == true)
    {
        printf("It is in small case\n");
    }
    else
    {
        printf("It is not small case\n");
    }

    return 0;
}