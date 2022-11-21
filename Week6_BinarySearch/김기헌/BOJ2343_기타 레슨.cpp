#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;
const int MAX = 100000;
int N, M;
int blueray[MAX];
bool func(int mid) {
    int sum = 0;
    int num = 1;
    for (int i = 0; i < N; i++) {
        if (blueray[i] > mid) return false;
        sum += blueray[i];
        if (sum > mid) {
            sum = blueray[i];
            num++;
        }
    }
    return M >= num;
}
int main(void) {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cin >> N >> M;
    int sum = 0;
    for (int i = 0; i < N; i++) {
        cin >> blueray[i];
        sum += blueray[i];
    }
    int low = 1, high = sum;
    int result = 0;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (func(mid)) {
            result = mid;
            high = mid - 1;
        }
        else low = mid + 1;
    }
    cout << result << "\n";
    return 0;
}