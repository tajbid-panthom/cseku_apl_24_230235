#include <iostream>
using namespace std;
int main()
{
    int a[5][5];
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            cin>>a[i][j];
        }
        
    }
    int sum=0;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < 5; j++)
        {
            if (a[i][j]==1)
            {
                sum=(abs(i-2)+abs(j-2));
            }
            
        }
        
    }
    cout<<sum<<endl;
    
return 0;
}