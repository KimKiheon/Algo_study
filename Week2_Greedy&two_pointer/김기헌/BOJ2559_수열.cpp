#include <iostream>
using namespace std;

int N, K;
int sum[100004];
int ans = -10000001;

int main() {

	cin >> N >> K;

	for (int i = 1; i <= N; i++) {
		int input;
		cin >> input;
		sum[i] = sum[i - 1] + input;
	}

	for (int i = K; i <= N; i++) {
		ans = max(ans, sum[i] - sum[i - K]);
	}

	cout << ans;

	return 0;
}