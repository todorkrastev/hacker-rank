#include <iostream>


void printResult(const std::string&);


int main() {

	int start, end;
	std::cin >> start >> end;

	for (size_t index = start; index <= end; index++) {
		if (1 <= index && index <= 9) {
			switch (index) {
			case 1:
				printResult("one");
				break;
			case 2:
				printResult("two");
				break;
			case 3:
				printResult("three");
				break;
			case 4:
				printResult("four");
				break;
			case 5:
				printResult("five");
				break;
			case 6:
				printResult("six");
				break;
			case 7:
				printResult("seven");
				break;
			case 8:
				printResult("eight");
				break;
			case 9:
				printResult("nine");
				break;
			}
		} else if (9 < index) {
			if (index % 2 == 0) {
				std::cout << "even" << std::endl;
			} else {
				std::cout << "odd" << std::endl;
			}
		}
	}

	return 0;
}

void printResult(const std::string& result) {
	std::cout << result << std::endl;
}