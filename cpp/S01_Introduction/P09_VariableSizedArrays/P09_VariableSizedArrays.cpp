#include <iostream>
#include <string>
#include <sstream>
#include <vector>

void getArrays(std::vector<std::vector<std::string>>&, const int&);

void printQueries(const std::vector<std::vector<std::string>>&);


int main() {

	int arraysNum, queriesNum;

	std::cin >> arraysNum >> queriesNum;
	std::cin.ignore();

	std::vector<std::vector<std::string>> arrays;

	for (size_t index = 0; index < arraysNum; index++) {
		getArrays(arrays, index);
	}

	for (size_t i = 0; i < queriesNum; i++) {
		printQueries(arrays);
	}

	return 0;
}

void getArrays(std::vector<std::vector<std::string>>& arrays, const int& index) {
	std::vector<std::string> values;
	std::string inputNums;
	std::getline(std::cin, inputNums);
	std::istringstream lineStream(inputNums);
	std::string currNum;
	while (lineStream >> currNum) {
		values.push_back(currNum);
	}

	arrays.push_back(values);
}

void printQueries(const std::vector<std::vector<std::string>>& arrays) {
	std::string readLine;
	std::getline(std::cin, readLine);
	std::istringstream lineStream(readLine);
	std::string array;
	std::string index;
	while (lineStream >> array >> index) {
		std::cout << arrays[std::stoi(array)][std::stoi(index) + 1] << std::endl;
	}
}