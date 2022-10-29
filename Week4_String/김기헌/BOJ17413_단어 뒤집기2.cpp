#include<iostream>
#include<string>
#include<cstring>
using namespace std;
bool flag = false;
int main() {
	string str;
	getline(cin, str);
	int left = 0, right = 0;
	for (int i = 0; i < str.size(); i++) {
		if (str[i] == '<') {
			flag = true;
			if(i)reverse(str.begin() + left, str.begin() + i);
		}
		else if (str[i] == '>') {
			flag = false;
			left = i + 1;
		}
		else if ((str[i] == ' ') && !flag) {
			reverse(str.begin() + left, str.begin() + i);
			left = i + 1;
		}
		else if (i == str.size() - 1 && !flag) {
			reverse(str.begin() + left, str.end());
		}

	}
	cout << str << "\n";
	return 0;
}