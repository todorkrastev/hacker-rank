#include <iostream>

#define SIZE 1000

int main() {

	int arr[SIZE];

	int countOfNums;

	std::cin >> countOfNums;

	for (size_t i = 0; i < countOfNums; i++) {
		std::cin >> arr[i];
	}

	for (size_t i = countOfNums - 1; i >= 0; i--) {
		if (i == 0) {
			std::cout << arr[i] << std::endl;
			break;
		}
		std::cout << arr[i] << " ";
	}


	return 0;
}