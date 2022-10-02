#include <iostream>
#include <string>
#include <regex>

void printResult(const std::string&);


int main() {
	std::string text;
	getline(std::cin, text);

	std::regex r("\\s+");
	text = std::regex_replace(text, r, "");

	int num = std::stoi(text);

	if (1 <= num && num <= 1000000000) {
		switch (num) {
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
		default:
			std::cout << "Greater than 9" << std::endl;
			break;
		}
	}

	return 0;
}

void printResult(const std::string& result) {
	std::cout << result << std::endl;
}
