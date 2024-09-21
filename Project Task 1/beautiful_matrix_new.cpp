<<<<<<< HEAD
#include <iostream>
#include <cmath> // For using the abs() function
using namespace std;

int main()
{
    int matrix[5][5]; // 5x5 matrix to store the input values

    // Reading the 5x5 matrix from input
    for (int row = 0; row < 5; row++)
    {
        for (int col = 0; col < 5; col++)
        {
            cin >> matrix[row][col];
        }
    }

    int movesRequired = 0; // Variable to store the result (number of moves)

    // Loop through the matrix to find the position of '1'
    for (int row = 0; row < 5; row++)
    {
        for (int col = 0; col < 5; col++)
        {
            // If we find '1', calculate the moves to center (2,2)
            if (matrix[row][col] == 1)
            {
                movesRequired = abs(row - 2) + abs(col - 2);
            }
        }
    }

    // Output the total number of moves required
    cout << movesRequired << endl;

    return 0;
}
=======
#include <iostream>
#include <cmath> // For using the abs() function
using namespace std;

int main()
{
    int matrix[5][5]; // 5x5 matrix to store the input values

    // Reading the 5x5 matrix from input
    for (int row = 0; row < 5; row++)
    {
        for (int col = 0; col < 5; col++)
        {
            cin >> matrix[row][col];
        }
    }

    int movesRequired = 0; // Variable to store the result (number of moves)

    // Loop through the matrix to find the position of '1'
    for (int row = 0; row < 5; row++)
    {
        for (int col = 0; col < 5; col++)
        {
            // If we find '1', calculate the moves to center (2,2)
            if (matrix[row][col] == 1)
            {
                movesRequired = abs(row - 2) + abs(col - 2);
            }
        }
    }

    // Output the total number of moves required
    cout << movesRequired << endl;

    return 0;
}
>>>>>>> da2d3a9939e4a6e1fc33872ede8ee956ba5f8083
