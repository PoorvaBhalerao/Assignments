// Write a program to copy contents of one string to another removing white spaces
//I/p: Poo   rva P atan kar
//o/p: PoorvaPatankar

#include<stdio.h>

void strcpyX(char *src, char *dest)
{

    while(*src != '\0')
    {
        if(*src == ' ')
        {
            src++;
        }
        else
        {
            *dest = *src;
            src++;
            dest++;
        }        
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