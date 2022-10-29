#include<iostream>
#include<map>
#include<algorithm>
#include<string>
using namespace std;
map <string, int>m1;
map <int, string>m2;
int main() {
	ios::sync_with_stdio(false);
	cin.tie(0), cout.tie(0);
	int n, m;
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		string s;
		cin >> s;
		m1.insert({ s,i + 1 });
		m2.insert({ i + 1,s });
	}
	for (int i = 0; i < m; i++) {
		string s;
		int tmp;
		cin >> s;
		if ('0' <= s[0] && s[0] <= '9') {
			tmp = stoi(s);
			cout << m2.at(tmp) << "\n";
			continue;
		}
		cout << m1.at(s) << "\n";
	}
	return 0;
}