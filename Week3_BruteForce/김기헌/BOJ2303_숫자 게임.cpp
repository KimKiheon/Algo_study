#include<iostream>
#include<algorithm>
#include<vector>
#include<utility>
using namespace std;
int arr[1005][5], sum[1005];
vector<pair<int, int>>ans;
void go(int n) {
	ans[n].second = n;
	for (int i = 0; i < 5; i++) {
		for (int j = i + 1; j < 5; j++) {
			int tmp = sum[n] - arr[n][i] - arr[n][j];
			ans[n].first = max(ans[n].first, tmp % 10);
		}
	}

}
int main() {
	int n;
	cin >> n;
	ans.resize(n);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < 5; j++) {
			cin >> arr[i][j];
			sum[i] += arr[i][j];
		}
	}
	for (int i = 0; i < n; i++) {
		go(i);
	}
	sort(ans.begin(), ans.end());
	cout << ans[n - 1].second + 1 << "\n";
	return 0;
}