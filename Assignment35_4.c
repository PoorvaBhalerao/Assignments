// Accept String from user and check whether it contains vowels or not

#include<stdio.h>
#include<stdbool.h>

bool CheckVowel(char *str)
{
    bool bFlag = false;

    while(*str != '\0')
    {
        if((*str == 'a') || (*str == 'e') || (*str == 'i') || (*str == 'o') || (*str == 'u') ||
         (*str == 'A') || (*str == 'E') || (*str == 'I') || (*str == 'O') || (*str == 'U'))
        {
            bFlag = true;            
        }
                
        str++;
    }
    return bFlag;
}

int main()
{
    char Arr[] = {'\0'};
    bool iRet = false;

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    iRet = CheckVowel(Arr);

    if(iRet == true)
    {
        printf("String contains vowels\n");
    }
    else
    {
        printf("String not contains vowels\n");
    }

    return 0;
}