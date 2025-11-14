////Accept N numbers from user and return difference between frequency of even numbers and odd numbers.

#include<stdio.h>
#include<stdlib.h>

int Frequency(int Arr[], int iSize)
{
    int iCnt = 0, iCount1 = 0, iCount2=0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iCount1++;
        }
        else
        {
            iCount2++;
        }
    }
    return iCount1-iCount2;
}

int main()
{
    int iLength = 0, iRet = 0, iCnt = 0;
    int *ptr = NULL;

    printf("Enter number of elements: \n");
    scanf("%d",&iLength);

    ptr =(int *)malloc(iLength * sizeof(int));

    if(ptr == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter Elements:\n");
    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d", &ptr[iCnt]);
    }

    iRet = Frequency(ptr, iLength);

    printf("Difference between frequency of even elements  and odd elements is: %d\n",iRet);

    free(ptr);

    return 0;
}