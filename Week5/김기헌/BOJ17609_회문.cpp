#include<string>
#include<iostream>
#include<algorithm>
using namespace std;
int go(string str, int cnt) {
	if (cnt == 2)return 2;
	int left = 0, right = str.size() - 1;
	while (left <= right) {
		if (str[left] != str[right]) {
			cnt++;
			return min(go(str.substr(left, right - left), cnt),
				go(str.substr(left + 1, right - left), cnt));
		}
		left++;
		right--;
	}
	return cnt;
}
int main() {
	int n;
	cin >> n;
	while (n--) {
		string str;
		cin >> str;
		cout << go(str, 0) << "\n";
	}
}