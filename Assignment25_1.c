// Accept N numbers from user and return Differecne between Summation of even numbers and Summation of Odd numbers

#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iSize)
{
    int iCnt = 0,iSum1=0, iSum2=0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iSum1  = iSum1 + Arr[iCnt];
        }
        else
        {
            iSum2  = iSum2 + Arr[iCnt];
        }
    }
    return iSum1-iSum2;
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
    
    iRet = Difference(ptr, iLength);

    printf("Difference between summation of even and odd numbers is: %d\n", iRet);

    free(ptr);

    return 0;
}