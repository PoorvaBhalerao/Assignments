// Accept N numbers from user and check whether that numbers contains 11 in it or not.
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Check(int Arr[], int iSize)
{
    int iCnt = 0;
    bool bFlag = false;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == 11)
        {
            bFlag = true;
            break;
        }
    }
    return bFlag;
}

int main()
{
    int iLength = 0, iCnt = 0;
    bool bRet = false;
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

    bRet = Check(ptr, iLength);

    if(bRet == true)
    {
        printf("11 is present\n");
    }
    else
    {
        printf("11 is not present\n");
    }

    free(ptr);

    return 0;
}