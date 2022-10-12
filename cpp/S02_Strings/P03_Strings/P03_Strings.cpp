#include <iostream>
#include <string>

void printLenOfStrs(const std::string& str1, const std::string& str2);
std::string concatStrs(std::string str1, std::string str2);
std::string swapFirstChar(std::string& str1, std::string& str2);

int main() {

	std::string str1, str2;
	std::getline(std::cin, str1);
	std::getline(std::cin, str2);

	printLenOfStrs(str1, str2);
	std::cout << concatStrs(str1, str2) << std::endl;
	std::cout << swapFirstChar(str1, str2) << std::endl;

	return 0;
}

void printLenOfStrs(const std::string& str1, const std::string& str2) {
	std::cout << str1.size() << " " << str2.size() << std::endl;
}

std::string concatStrs(std::string str1, std::string str2) {
	return str1 + str2;
}

std::string swapFirstChar(std::string& str1, std::string& str2) {
	char temp = str1[0];
	str1[0] = str2[0];
	str2[0] = temp;

	return str1 + " " + str2;
}
