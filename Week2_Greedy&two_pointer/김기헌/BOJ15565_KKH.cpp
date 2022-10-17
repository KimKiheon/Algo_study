#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	ios::sync_with_stdio(0);
	cout.tie(0);
	cin.tie(0);

	int n, k, ans = 1000001;
	cin >> n >> k;

	vector<int> v(n);
	vector<int> ones;

	for (int i = 0; i < n; i++) {
		cin >> v[i];
		if (v[i] == 1)
			ones.push_back(i);
	}
	if (ones.size() < k) {
		cout << -1;
		return 0;
	}
	for (int i = 0; i <= ones.size() - k; i++)
		ans = min(ans, ones[i + k - 1] - ones[i] + 1);
	cout << ans;

	return 0;
}