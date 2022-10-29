#include<iostream>
#include<deque>
#include<algorithm>
#include<string>
using namespace std;
int main() {
	int T;
	cin >> T;
	while (T--) {
		deque<int>dq;
		string str, num, tmp;
		bool flag = false, dqIsEmpty = false;
		int size;
		cin >> str >> size >> num;
		for (int i = 1; i < num.size(); i++) {
			if (num[i] == ']' || num[i] == ',') {
				if (tmp != "")dq.push_back(stoi(tmp));
				tmp = "";
			}else {
				tmp += num[i];
			}
		}
		//flag==true이면 뒤집힌 상태
		for (int i = 0; i < str.size(); i++) {
			if (str[i] == 'R') {
				flag = !flag;
				continue;
			}
			if (dq.empty()) {
				dqIsEmpty = true;
				break;
			}
			if (!flag)dq.pop_front();
			else dq.pop_back();
		}
		if (dqIsEmpty) {
			cout << "error" << "\n";
			continue;
		}
		string ans = "[";
		size = dq.size();
		if (!flag) {
			while (!dq.empty()) {
				ans += to_string(dq.front());
				dq.pop_front();
				ans += ',';
				if (dq.empty())ans.pop_back();
			}
		}
		else {
			while (!dq.empty()) {
				ans += to_string(dq.back());
				dq.pop_back();
				ans += ',';
				if (dq.empty())ans.pop_back();
			}
		}
		ans += ']';
		cout << ans << "\n";

	}
	return 0;

}