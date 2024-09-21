<<<<<<< HEAD
#include <iostream>
using namespace std;

/* Md Tajbid Hossain Bappi ID:230235 UnderGraduate Student of Khulna University, Khulna */

int main()
{
    // Determining the winner between "Anton" and "Danik" based on a sequence of 'A' and 'D' characters in a string

    int numberOfGames; // Variable to store the number of games
    cin >> numberOfGames;

    // If numberOfGames is less than or equal to 0, terminate the program with no results.
    if (numberOfGames <= 0)
    {
        cout << "Friendship" << endl; // Consider it a draw when no games are played
        return 0;
    }

    string results; // Variable to store the sequence of game results
    cin >> results;

    // Validate the input to ensure the string length matches the number of games
    if (results.length() != numberOfGames)
    {
        cerr << "Error: Input string length does not match the number of games." << endl;
        return 1; // Exit with error code 1
    }

    // Variables to count wins for Anton and Danik
    int antonWins = 0, danikWins = 0;

    // Loop through the results to count wins
    for (int i = 0; i < numberOfGames; i++)
    {
        // If the character is 'A', Anton wins the game
        if (results[i] == 'A')
            antonWins++;

        // If the character is 'D', Danik wins the game
        else if (results[i] == 'D')
            danikWins++;
        else
        {
            // If the character is not 'A' or 'D', show an error and stop execution
            cerr << "Error: Invalid character in results string. Only 'A' and 'D' are allowed." << endl;
            return 1; // Exit with error code
        }
    }

    // Compare the wins and determine the outcome
    if (antonWins > danikWins)
        cout << "Anton" << endl; // Anton wins more games
    else if (antonWins < danikWins)
        cout << "Danik" << endl; // Danik wins more games
    else
        cout << "Friendship" << endl; // Both win an equal number of games

    return 0;
}
=======
#include <iostream>
using namespace std;

/* Md Tajbid Hossain Bappi ID:230235 UnderGraduate Student of Khulna University, Khulna */

int main()
{
    // Determining the winner between "Anton" and "Danik" based on a sequence of 'A' and 'D' characters in a string

    int numberOfGames; // Variable to store the number of games
    cin >> numberOfGames;

    // If numberOfGames is less than or equal to 0, terminate the program with no results.
    if (numberOfGames <= 0)
    {
        cout << "Friendship" << endl; // Consider it a draw when no games are played
        return 0;
    }

    string results; // Variable to store the sequence of game results
    cin >> results;

    // Validate the input to ensure the string length matches the number of games
    if (results.length() != numberOfGames)
    {
        cerr << "Error: Input string length does not match the number of games." << endl;
        return 1; // Exit with error code 1
    }

    // Variables to count wins for Anton and Danik
    int antonWins = 0, danikWins = 0;

    // Loop through the results to count wins
    for (int i = 0; i < numberOfGames; i++)
    {
        // If the character is 'A', Anton wins the game
        if (results[i] == 'A')
            antonWins++;

        // If the character is 'D', Danik wins the game
        else if (results[i] == 'D')
            danikWins++;
        else
        {
            // If the character is not 'A' or 'D', show an error and stop execution
            cerr << "Error: Invalid character in results string. Only 'A' and 'D' are allowed." << endl;
            return 1; // Exit with error code
        }
    }

    // Compare the wins and determine the outcome
    if (antonWins > danikWins)
        cout << "Anton" << endl; // Anton wins more games
    else if (antonWins < danikWins)
        cout << "Danik" << endl; // Danik wins more games
    else
        cout << "Friendship" << endl; // Both win an equal number of games

    return 0;
}
>>>>>>> da2d3a9939e4a6e1fc33872ede8ee956ba5f8083
