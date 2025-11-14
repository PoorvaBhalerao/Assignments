// Accept N numbers from user and display summation of digits of each number
#include<stdio.h>
#include<stdlib.h>

void Digits(int Arr[], int iSize)
{
    int iCnt = 0, iDigit = 0, iSum = 0, iNo = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        iNo = Arr[iCnt];
        while(Arr[iCnt] != 0)
        {
            iDigit = Arr[iCnt] % 10;
            iSum = iSum + iDigit;
            Arr[iCnt] = Arr[iCnt] / 10;
        }
    
        printf("\n%d\t", iSum);
        iSum = 0;
    }
    
}

int main()
{
    int iLength = 0, iCnt = 0, iRet = 0;
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
    
    Digits(ptr, iLength);

    free(ptr);

    return 0;
}