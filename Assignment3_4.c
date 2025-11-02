//Accept character from user and convert case of that character.

#include<stdio.h>
#include<ctype.h>

void ConvertCase(char cValue)
{
    if(cValue >= 'a' && cValue <= 'z')
    {
        printf("%c\n",toupper(cValue));
    }
    else if(cValue >= 'A' && cValue <= 'Z')
    {
        printf("%c\n",tolower(cValue));
    }
}


int main()
{
    char CValue= '\0';

    printf("Enter a Character: \n");
    scanf("%c",&CValue);

    ConvertCase(CValue);
    
    return 0;
}