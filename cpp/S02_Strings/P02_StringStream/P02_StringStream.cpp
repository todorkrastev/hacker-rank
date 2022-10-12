#include <sstream>
#include <vector>
#include <iostream>

void parseInts(std::vector<std::string>&, std::string&);
void printResult(const std::vector<std::string>&);

int main() {
    std::vector<std::string> integers;
    std::string str;
    std::cin >> str;
    parseInts(integers, str);
    printResult(integers);

    return 0;
}

void parseInts(std::vector<std::string>& integers, std::string& str) {
    std::stringstream ss(str);
    
    while (ss.good()) {
        std::string substr;
        std::getline(ss, substr, ',');
        integers.push_back(substr);
    }
}

void printResult(const std::vector<std::string>& integers) {
    for (size_t i = 0; i < integers.size(); i++) {
        std::cout << integers[i] << std::endl;
    }
}
