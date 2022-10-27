#include<iostream>
#include<algorithm>
using namespace std;
int arr[2000005];
int main() {
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	int n, m;
	cin >> n >> m;
	for (int i = 0; i < n + m; i++) {
		cin >> arr[i];
	}
	sort(arr, arr + n + m);
	for (int i = 0; i < n + m; i++) {
		cout << arr[i] << " ";
	}
	return 0;
}