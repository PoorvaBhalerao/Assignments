// Write a program which accept string from user and toggle the string
#include<stdio.h>

void toggle(char *str)
{
    while(*str != '\0')
    {

        if((*str >= 'a') && (*str <= 'z'))
        {
            *str = *str - 32;
            
        }
        else if((*str >= 'A') && (*str <= 'Z'))
        {
            *str = *str + 32;
        }
        str++;
    }
}

int main()
{
    char Arr[] = {'\0'};

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    toggle(Arr);
    
    printf("Updated string is: %s\n",Arr);

    return 0;
}