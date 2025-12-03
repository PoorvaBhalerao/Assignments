// Write a program to copy contents of one string to another converting all capital characters into small characters

#include<stdio.h>

void strcpyX(char *src, char *dest)
{

    while(*src != '\0')
    {
        if((*src >= 'A') && (*src <= 'Z'))
        {
            *src = *src +32;
            
        }
        
        *dest = *src;
        src++;
        dest++;
               
    }
    dest = '\0';

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