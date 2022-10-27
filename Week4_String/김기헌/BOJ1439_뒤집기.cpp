#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main() {
	string str;
	bool flag=false;
	int cnt = 0;
	cin >> str;
	for (int i = 1; i < str.size(); i++) {
		if (str[i] != str[0]) {
			if (!flag)cnt++;
			flag = true;
		}
		else flag = false;
	}
	cout << cnt << "\n";
	return 0;
}