#include <iostream>
using namespace std;

int main()
{
    string input; // Variable to store the input string
    cin >> input;

    string result = ""; // Variable to store the final translated result

    // Loop through the input string
    for (int i = 0; i < input.length(); i++)
    {
        if (input[i] == '.') // If the character is '.', it translates to '0'
        {
            result += '0';
        }
        else if (input[i] == '-' && input[i + 1] == '.') // If it's "-.", translate it to '1'
        {
            result += '1';
            i++; // Skip the next character as it's part of this pattern
        }
        else if (input[i] == '-' && input[i + 1] == '-') // If it's "--", translate it to '2'
        {
            result += '2';
            i++; // Skip the next character as it's part of this pattern
        }
    }

    // Output the final result
    cout << result << endl;

    return 0;
}
