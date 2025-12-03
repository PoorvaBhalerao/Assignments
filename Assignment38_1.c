// Write a program which accepts string from user and copy characters of one string to another string in reverse order

#include<stdio.h>

void strcpyX(char *src, char *dest)
{
    int ilength = 0;

    while(*src != '\0')
    {
        src++;
        ilength++;
    }
    src--;

    while(ilength > 0)
    {
        *dest = *src;
        src--;
        dest++;
        ilength--;
    }
    *dest = '\0';
}

int main()
{
    char Arr[100] = {'\0'};
    char Brr[100] = {'\0'};

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    strcpyX(Arr, Brr);
    
    printf("Updated string is :%s\n",Brr);

    return 0;
}