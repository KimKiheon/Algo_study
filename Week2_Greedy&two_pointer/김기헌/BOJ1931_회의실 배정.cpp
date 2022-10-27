#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
typedef pair<int, int>p;
vector<p>v;
p now;
int n;
int main() {
	cin >> n;
	int cnt = 1;
	for (int i = 0; i < n; i++) {
		int a, b;
		cin >> a >> b;
		v.push_back({ a,b });
	}
	sort(v.begin(), v.end());
	now = v[0];
	for (int i = 1; i < v.size(); i++) {
		if (now.second > v[i].second)
			now = v[i];
		else if (now.second <= v[i].first) {
			now = v[i];
			cnt++;
		}
	}
	cout << cnt << "\n";
	return 0;
}