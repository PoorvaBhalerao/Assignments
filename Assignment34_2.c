// Accept character from user and in case it is small then display its capital character and if it is capital display its small character.

#include<stdio.h>

void Display(char ch)
{
    if((ch >= 'a') && (ch <='z'))
    {
        printf("%c",(ch-32));
    }
    else if((ch >= 'A') && (ch <='Z'))
    {
        printf("%c",(ch+32));
    }
    else
    {
        printf("Invalid Input\n");
        return;
    }
}

int main()
{
    char cValue = 0;

    printf("Enter a character: \n");
    scanf("%c",&cValue);

    Display(cValue);
    return 0;
}