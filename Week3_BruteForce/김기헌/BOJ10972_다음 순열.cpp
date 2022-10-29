#include <iostream>
#include <algorithm>
using namespace std;
int num[10000];
int n;
int main()
{
    cin >> n;
    for (int i = 0; i < n; i++) cin >> num[i];
    if (next_permutation(num, num + n))
        for (int i = 0; i < n; i++)
            cout << num[i] << " ";
    else
        cout << -1;
    return 0;
}