// Accept character from user and display its ASCII value in decimal, hexadecimal and Octal format

#include<stdio.h>

void Display(char ch)
{
    printf("Decimal     : %d\n", ch);
    printf("Hexadecimal : 0X%x\n", ch);
    printf("Octal       : 0%o", ch);
}

int main()
{
    char cValue = 0;

    printf("Enter a character: \n");
    scanf("%c",&cValue);

    Display(cValue);
    return 0;
}