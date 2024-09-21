#include <iostream>
using namespace std;

/* Md Tajbid Hossain Bappi ID:230235 UnderGraduate Student of Khulna University, Khulna */

int main()
{
    int testCases; // Variable to store the number of test cases
    cin >> testCases;

    // Loop through each test case
    while (testCases--)
    {
        int stringLength; // Variable to store the length of the strings
        cin >> stringLength;

        string initialState, finalState; // Variables to store the initial and final states of the strings
        cin >> initialState >> finalState;

        // Counters to track the differences between '1's and '0's
        int countOne = 0, countZero = 0;

        // Loop through each character of the strings
        for (int i = 0; i < stringLength; i++)
        {
            // If the characters in the two strings are the same, continue to the next iteration
            if (initialState[i] == finalState[i])
            {
                continue;
            }

            // If the character in the initialState is '1', increment countOne
            if (initialState[i] == '1')
            {
                countOne++;
            }
            // Otherwise, increment countZero
            else
            {
                countZero++;
            }
        }

        // Output the result based on the formula: (countOne + countZero) - min(countOne, countZero)
        cout << (countOne + countZero) - min(countOne, countZero) << endl;
    }

    return 0;
}
