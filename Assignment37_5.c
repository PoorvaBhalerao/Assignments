// Write a program to reverse the string in place

#include<stdio.h>
#include<stdbool.h>

void Reverse(char *str)
{
    char *start = str;
    char *end = str;
    char temp = '\0';

    while(*end != '\0')
    {
        end++;
    }
    end--;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
    end = '\0';

}

int main()
{
    char Arr[] = {'\0'};

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    Reverse(Arr);
    
    printf("Updated string is :%s\n",Arr);

    return 0;
}