#include <iostream>
using namespace std;

/* Md Tajbid Hossain Bappi ID:230235 UnderGraduate Student of Khulna University, Khulna */

int main()
{
    int weightLimak, weightBob; // Variables to store the weights of Limak and Bob
    cin >> weightLimak >> weightBob;

    int years = 0; // Counter to track the number of years

    // Loop until Limak's weight exceeds Bob's weight
    while (weightLimak <= weightBob)
    {
        // Each year Limak's weight triples, and Bob's weight doubles
        weightLimak *= 3;
        weightBob *= 2;
        ++years; // Increment the year counter
    }

    // Output the number of years it takes for Limak's weight to exceed Bob's
    cout << years;

    return 0;
}
