#include <iostream>

struct Student {
    int age;
    std::string firstName;
    std::string lastName;
    int standard;
};

int main() {
    Student student;

    std::cin >> student.age >> student.firstName >> student.lastName >> student.standard;
    std::cout << student.age << " " << student.firstName << " " << student.lastName << " " << student.standard;

    return 0;
}