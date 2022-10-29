#include<iostream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
int check[26];
int main() {
	string str;
	bool isOdd = false;
	int cnt = 0;
	char center;
	cin >> str;
	vector<char>v;
	if (!str.size() % 2)isOdd = true;
	for (int i = 0; i < str.size(); i++) {
		v.push_back(str[i]);
		check[str[i] - 'A']++;
	}
	for (int i = 0; i < 26; i++) {
		if (check[i] % 2) {
			cnt++;
			center = i + 'A';
		}
	}
	if (cnt > 1) {
		cout << "I'm Sorry Hansoo" << "\n";
		return 0;
	}
	string ans;
	for (int i = 0; i < 26; i++) {
		if (check[i] > 0) {
			for (int j = 0; j < check[i] / 2; j++)ans += i + 'A';
		}

	}
	string tmp;
	for (int i = ans.size() - 1; i >= 0; i--)tmp += ans[i];
	if (cnt)ans += center;
	ans += tmp;
	cout << ans << "\n";
	return 0;
}