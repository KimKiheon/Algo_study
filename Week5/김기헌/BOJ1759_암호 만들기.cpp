#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<char>v;
int n, s;

char vowel[5] = { 'a','e','i','o','u' };
int check[15];
int go(int cnt, int here, int vowelCount) {
	bool flag = false;
	if (cnt == n) {
		if (vowelCount < 1 || n - vowelCount < 2)return 0;
		for (int i = 0; i < s; i++) {
			if (check[i]) cout << v[i];
		}
		cout << "\n";
		return 1;
	}

	for (int i = here; i < s; i++) {
		if (!check[i]) {
			check[i] = 1;
			for (int j = 0; j < 5; j++)if (vowel[j] == v[i]) {
				flag = true;
				break;
			}
			go(cnt + 1, i + 1, flag == true ? vowelCount + 1 : vowelCount);
			flag = false;
			check[i] = 0;
		}
	}
	return 0;
}
int main() {
	cin >> n >> s;
	for (int i = 0; i < s; i++) {
		char a;
		cin >> a;
		v.push_back(a);
	}
	sort(v.begin(), v.end());
	go(0, 0, 0);
	return 0;
}