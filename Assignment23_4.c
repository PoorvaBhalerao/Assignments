// Accept N numbers from user , Accept range and display all the numbers from that range
#include<stdio.h>
#include<stdlib.h>

void Display(int Arr[], int iSize, int iNo1, int iNo2)
{
    int iCnt = 0;
    
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if((Arr[iCnt] >= iNo1) && (Arr[iCnt] <= iNo2))
        {
            printf("%d\t",Arr[iCnt]);
        }
    }    
}

int main()
{
    int iLength = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;
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

    printf("Enter Starting Point:\n");
    scanf("%d", &iValue1);

    printf("Enter Ending Point:\n");
    scanf("%d", &iValue2);

    Display(ptr, iLength, iValue1, iValue2);
   
    free(ptr);

    return 0;
}