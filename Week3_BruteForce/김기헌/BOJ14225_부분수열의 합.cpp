/*#include<iostream>
using namespace std;
int arr[100005], ans[2000000];
int n;
void go(int now,int sum) {
	if (n == now) {
		ans[sum] = 1;
		return;
	}
	go(now + 1, sum + arr[now]);
	go(now + 1, sum);
}
int main() {
	cin >> n;
	for (int i = 0; i < n; i++) cin >> arr[i];
	go(0, 0);
	for (int i = 1; i < 2000001; i++) {
		if (!ans[i]) {
			cout << i;
			return 0;
		}
	}
	return 0;
}*/