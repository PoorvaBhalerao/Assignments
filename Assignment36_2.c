// Write a program which accept string from user and convert it in to upper case
#include<stdio.h>

void struprX(char *str)
{
    while(*str != '\0')
    {

        if((*str >= 'a') && (*str <= 'z'))
        {
            *str = *str - 32;
            
        }
        str++;
    }
}

int main()
{
    char Arr[] = {'\0'};

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    struprX(Arr);
    
    printf("Updated string is: %s\n",Arr);

    return 0;
}