// Accept character from user and check whether it is capital or not

#include<stdio.h>
#include<stdbool.h>

bool ChkCapital(char ch)
{
    bool bFlag = false;

    if((ch >= 'A') && (ch <= 'Z'))
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
    
    bRet = ChkCapital(ch);

    if(bRet == true)
    {
        printf("It is Capital letter\n");
    }
    else
    {
        printf("It is not a Capital letter\n");
    }

    return 0;
}