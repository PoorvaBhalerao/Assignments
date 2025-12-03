// Accept character from user and check it is symbol or not(~,!,@,#,$.%,^,&,*)

#include<stdio.h>
#include<stdbool.h>

bool Display(char ch)
{
    bool bFlag = false;
    if((ch == '~') || (ch =='!') || (ch == '@') || (ch =='#') || (ch == '$') || (ch =='%') || (ch == '^') || (ch == '&') || (ch == '*'))
    {
        bFlag = true;
    }
   
    return bFlag;
}

int main()
{
    char cValue = 0;
    bool bRet = false;

    printf("Enter a character: \n");
    scanf("%c",&cValue);

    bRet = Display(cValue);
    if(bRet == true)
    {
        printf("It is a symbol\n");
    }
    else
    {
        printf("It is not a Symbol\n");
    }

    return 0;
}