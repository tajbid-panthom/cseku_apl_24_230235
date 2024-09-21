#include <iostream>
using namespace std;

int main()
{   
    int t;
    cin>>t;
    while (t--)
    {   
        int n;
        cin>>n;
        string s,f;
        cin>>s>>f;
        int count1=0,count2=0;
        for (int i = 0; i<n; i++)
        {   
            if (s[i]==f[i])
            {
                continue;
            }
            
            if (s[i]=='1')
            {
                count1++;
            }
            else count2++;
            
        }
        cout<<(count1+count2)-min(count1,count2)<<endl;
    }
    
    
return 0;
}