#include<iostream>
#include<algorithm>
using namespace std;
int day[15], pay[15], sum[15];
int main() {
	int n;
	cin >> n;
	for (int i = 1; i <= n; i++)cin >> day[i] >> pay[i];
	for (int i = 1; i <= n; i++) {
		sum[i + day[i] - 1] = max(sum[i + day[i] - 1], max(sum[i - 1], sum[i - 1] + pay[i]));
		sum[i] = max(sum[i], sum[i - 1]);
	}
	cout << sum[n];
	return 0;
}