//Accept a character from user and check that character is Vowel or not

#include<stdio.h>
#include<stdbool.h>

bool CheckVowel(char cValue)
{
    bool bFlag = false;

    if((cValue == 'a') || (cValue == 'e') || (cValue == 'i') || (cValue == 'o') || (cValue == 'u') 
    || (cValue == 'A') || (cValue == 'E') || (cValue == 'I') || (cValue == 'O') || (cValue == 'U'))
    {
        bFlag = true;
    }

    return bFlag;
}


int main()
{
    char CValue= '\0';
    bool bRet = false;

    printf("Enter a Character: \n");
    scanf("%c",&CValue);

    bRet = CheckVowel(CValue);

    if(bRet == true)
    {
        printf("The character is vowel\n");
    }
    else
    {
        printf("The character is not vowel\n");
    }
    
    return 0;
}