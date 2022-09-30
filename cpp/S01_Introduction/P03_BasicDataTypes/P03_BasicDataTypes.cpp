#include <iostream>

int main() {

	int intNum;
	long long longNum;
	char ch;
	float floatingNum;
	double doubleNum;

	std::cin >> intNum >> longNum >> ch >> floatingNum >> doubleNum;

	std::cout << intNum << std::endl;
	std::cout << longNum << std::endl;
	std::cout << ch << std::endl;

	std::cout.setf(std::ios::fixed);
	std::cout.precision(3);

	std::cout << floatingNum << std::endl;

	std::cout.precision(9);

	std::cout << doubleNum << std::endl;


	return 0;
}