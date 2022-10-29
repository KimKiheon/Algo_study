#include<iostream>
#include<map>
#include<algorithm>
#include<vector>
#include<string>
using namespace std;
#define N 20
bool arr[N + 1];
int main() {
	ios::sync_with_stdio(0);
	cin.tie(NULL);
	cout.tie(NULL);
	//n이 300만이므로 cin.tie, cout.tie 안해주면 시간초과 남!!
	int t;
	cin >> t;
	while (t--) {
		string str;
		int n;
		cin >> str;
		if (str == "all") {
			for (int i = 1; i <= N; i++)arr[i] = 1;
			continue;
		}
		else if (str == "empty") {
			for (int i = 1; i <= N; i++)arr[i] = 0;
			continue;
		}
		cin >> n;
		if (str == "add")	arr[n] = 1;
		else if (str == "remove")arr[n] = 0;
		else if (str == "check") {
			if (arr[n] == 1)cout << 1 << "\n";
			else cout << 0 << "\n";
		}
		else if (str == "toggle")arr[n] = !arr[n];

	}
}