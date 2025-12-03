//Write a program which displays ASCII table. Table contains Symbol, decimal ,Hexadecmal, Octal representation of every member from 0 to 255

#include <stdio.h>
#include <ctype.h>

int main() {
    printf("-------------------------------------------------------------\n");
    printf("|   Dec   |   Hex    |   Oct   |   Char   |\n");
    printf("-------------------------------------------------------------\n");

    for (int i = 0; i <= 255; i++) {
        printf("|   %d   |   0x%X   |   %o    | ", i, i, i);

        if (isprint(i)) {
            printf("  %c |\n", i);
        } else {
            printf("  .  |\n");  // Non-printable shown as '.'
        }
    }

    printf("-------------------------------------------------------------\n");
    return 0;
}
