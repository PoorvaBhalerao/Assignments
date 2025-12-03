// Write a program which accept string from user and convert it in to lower case
#include<stdio.h>

void strlwrX(char *str)
{
    while(*str != '\0')
    {

        if((*str >= 'A') && (*str <= 'Z'))
        {
            *str = *str +32;
            
        }
        str++;
    }
}

int main()
{
    char Arr[] = {'\0'};

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    strlwrX(Arr);
    
    printf("Updated string is: %s\n",Arr);

    return 0;
}