// Write a program which accepts name from user and display that name.

#include<stdio.h>

int main()
{
    char Name[30];

    printf("Enter your name: \n");
    scanf("%[^\n]", Name);

    printf("Your name is: %s",Name);



    return 0;
}