// Accept character from user and if it is capital character Display from input character till 'Z', 
//and if it is small character display in reverse order till 'a'.

#include<stdio.h>

void Display(char ch)
{
    char ch1 = '\0';
    if((ch >= 'a') && (ch <='z'))
    {
        for(ch1 = ch; ch1 >= 'a'; ch1--)
        {
            printf("%c\t",ch1);
        }
    }
    else if((ch >= 'A') && (ch <='Z'))
    {
        for(ch1 = ch; ch1 <= 'Z'; ch1++)
        {
            printf("%c\t",ch1);
        }
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