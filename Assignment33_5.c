// Accept division of student on the division display time of exam,there are 4 divisions in school
//exam of division A is at 7AM, exam of division B is at 8:30AM, exam of division C is at 9:20AM and exam of division D is at 10:30AM

#include<stdio.h>
#include<stdbool.h>

void DisplaySchedule(char ch)
{
    switch(ch)
    {
        case 'A':
        printf("Your exam is at 7AM\n ");
        break;

        case 'B':
        printf("Your exam is at 8:30AM\n ");
        break;

        case 'C':
        printf("Your exam is at 9:20AM\n ");
        break;

        case 'D':
        printf("Your exam is at 10:30AM\n ");
        break;

        default:
        printf("Invalid Input\n ");
        return;

    }
}

int main()

{
    char Div = '\0';
   
    printf("Enter Division (A/B/C/D): \n");
    scanf("%s",&Div);                               
    
    DisplaySchedule(Div);

    return 0;
}