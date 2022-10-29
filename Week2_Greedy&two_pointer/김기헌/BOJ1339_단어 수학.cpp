#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
typedef pair<int, int>p;
int sum[26];
typedef long long ll;
vector<string>v;
vector<ll>vv;
ll ans;
int cmp(ll a, ll b) {
	return a > b;
}
int main() {
	int n;
	cin >> n;
	for (int i = 0; i < n; i++) {
		string str;
		cin >> str;
		v.push_back(str);
		int tmp = 1;
		while (str != "") {
			int s = str.size() - 1;
			sum[str[s] - 'A'] += tmp;
			tmp *= 10;
			str.pop_back();
		}
	}
	for (int i = 0; i < 26; i++) {
		if (sum[i])vv.push_back(sum[i]);
	}
	sort(vv.begin(), vv.end(),cmp);
	ans = 0;
	int tmp = 9;
	for (int i = 0; i < vv.size(); i++) {
		ans += vv[i] * tmp;
		tmp--;
	}
	cout << ans << "\n";
	return 0;
}