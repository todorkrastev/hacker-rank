#include <iostream>

#define SIZE 4

int maxNum(int[]);

int main() {
	int array[SIZE];

	for (size_t i = 0; i < SIZE; i++) {
		std::cin >> array[i];
	}

	int result = maxNum(array);

	std::cout << result << std::endl;

	return 0;
}

int maxNum(int arr[]) {
	int max = INT32_MIN;

	for (size_t i = 0; i < SIZE; i++) {
		if (max < arr[i]) {
			max = arr[i];
		}
	}

	return max;
}
