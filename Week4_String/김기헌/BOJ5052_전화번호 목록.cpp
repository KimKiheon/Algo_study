#include<iostream>
#include<algorithm>
#include<string>
#include<vector>
using namespace std;
int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	cout.tie(0);
	int t;
	cin >> t;
	while (t--) {
		bool flag = false;
		vector<string>v;
		int n;
		cin >> n;
		for (int i = 0; i < n; i++) {
			string s;
			cin >> s;
			v.push_back(s);
		}
		sort(v.begin(), v.end());
		for (int i = 0; i < n - 1; i++) {
			if (v[i] == v[i + 1].substr(0, v[i].size())) {
				flag = true;
				break;
			}
		}
		if (flag)cout << "NO" << "\n";
		else cout << "YES" << "\n";

	}
}