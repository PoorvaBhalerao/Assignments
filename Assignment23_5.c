// Accept N numbers from user and return Product of all Odd elements.

#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[], int iSize)
{
    int iCnt = 0, iProd = 1;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] % 2) == 1)
        {
            iProd = iProd * Arr[iCnt];
        }
    } 
    return iProd;   
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
    
    iRet = Product(ptr, iLength);

    printf("Product of all odd elements is: %d\n", iRet);
   
    free(ptr);

    return 0;
}