#include <iostream>
using namespace std;

int n, k;
int sum[100004];
int ans = -10000001;

int main() {

	cin >> n >> k;

	for (int i = 1; i <= n; i++) {
		int input;
		cin >> input;
		sum[i] = sum[i - 1] + input;
	}

	for (int i = k; i <= n; i++) {
		ans = max(ans, sum[i] - sum[i - k]);
	}

	cout << ans;

	return 0;
}