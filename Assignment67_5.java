// Write a program which accepts a number from user and range of positions from user and toggle the bits from that range.

import java.util.*;

class Logic
{
    public int ToggleBitsInRange(int iNo, int startPos, int endPos)
    {
        // Step 1: create mask
        int mask = ((1 << (endPos - startPos + 1)) - 1) << (startPos - 1);

        // Step 2: toggle bits using XOR
        int result = iNo ^ mask;

        return result;
    }
}

class Assignment67_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iNo = sc.nextInt();

        System.out.println("Enter start position: ");
        int startPos = sc.nextInt();

        System.out.println("Enter end position: ");
        int endPos = sc.nextInt();

        Logic obj = new Logic();
        int newNumber = obj.ToggleBitsInRange(iNo, startPos, endPos);

        System.out.println("Number after toggling bits: " + newNumber);
    }
}
