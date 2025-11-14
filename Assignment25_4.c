// Accept N numbers from user and Display such numbers which are divisible by 5 and 3.
#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[], int iSize)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(((Arr[iCnt] % 5) == 0) && ((Arr[iCnt] % 3) == 0))
        {
            printf("%d\t",Arr[iCnt]);
        }
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
    
    Display(ptr, iLength);

    free(ptr);

    return 0;
}