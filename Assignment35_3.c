// Accept String from user and return difference between frequency of small characters and frequency of Capital characters

#include<stdio.h>

int Difference(char *str)
{
    int iCountSmall = 0, iCountCapital = 0;

    while(*str != '\0')
    {
        if((*str >= 'a') && (*str <= 'z'))
        {
            iCountSmall++;            
        }
        else if((*str >= 'A') && (*str <= 'Z'))
        {
            iCountCapital++;
        }
        
        str++;
    }
    return (iCountSmall - iCountCapital);
}

int main()
{
    char Arr[] = {'\0'};
    int iRet = 0;

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    iRet = Difference(Arr);

    printf("Difference between frequency of small characters and capital characters is: %d\n",iRet);

    return 0;
}