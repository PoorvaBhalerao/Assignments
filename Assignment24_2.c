// Accept N numbers from user and return Smallest number.

#include<stdio.h>
#include<stdlib.h>

int Smallest(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMin = Arr[0];
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] < iMin)
        {
            iMin = Arr[iCnt];
        }
    } 
    return iMin;   
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
    
    iRet = Smallest(ptr, iLength);

    printf("Smallest Number is %d\n", iRet);
   
    free(ptr);

    return 0;
}