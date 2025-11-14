// Accept N Numbers from user and accept one another number as No and return index of last occurence of No from that numbers.

#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[], int iSize, int iNo)
{
    int iCnt = 0, iIndex= 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            iIndex = iCnt + 1;
        }
    }

    if(iIndex == 0)
    {
        return -1;
    }
    else
    {
        return iIndex;
    }
    
}

int main()
{
    int iLength = 0, iCnt = 0, iValue = 0;
    int iRet = 0;
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

    printf("Enter Number:\n");
    scanf("%d", &iValue);

    iRet = FirstOcc(ptr, iLength, iValue);

    if(iRet == -1)
    {
        printf("%d is not present\n",iValue);
    }
    else
    {
        printf("Index of Last Occurence of %d is %d\n",iValue, iRet);
    }
   
    free(ptr);

    return 0;
}