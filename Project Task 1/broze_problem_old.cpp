#include <iostream>
using namespace std;
int main()
{
    string s;
    cin>>s;
    for (int i = 0; s[i]!='\0'; i++)
    {
        if (s[i]=='.')
        {
            s[i]='0';
        }
        if (s[i]=='-'&&s[i+1]=='.')
        {
            s[i]='1';
            continue;
        }
        if (s[i]=='-'&&s[i+1]=='-')
        {
            s[i]='2';
            continue;
        }
    }
    cout<<s<<endl;
    
return 0;
}