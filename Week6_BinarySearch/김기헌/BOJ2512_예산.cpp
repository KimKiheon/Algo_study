#include <iostream>
#include <algorithm>
using namespace std;
typedef long long ll;

ll arr[10000];

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	ll maxi = 0;
	ll sum = 0;
	int N; cin >> N;
	for (int i = 0; i < N; i++) {
		ll x; cin >> x;
		sum += x;
		arr[i] = x;
		maxi = max(maxi, x);
	}

	sort(arr, arr + N);
	ll M; cin >> M;

	if (sum <= M) {
		cout << maxi;
		return 0;
	}
	int i = N - 1;
	ll cnt = 0;
	for (; i > 0; i--) {
		cnt++;
		ll dist = arr[i] - arr[i - 1];
		sum -= cnt * dist;
		if (sum <= M) {
			cout << arr[i - 1] + (M - sum) / cnt;
			break;
		}
	}
	if (i == 0) cout << M / N;
	return 0;
}