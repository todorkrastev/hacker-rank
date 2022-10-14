#include <iostream>

#define SIZE 5

class Student {
private:
    int scores[SIZE];
public:
    void input() {
        for (int i = 0; i < 5; i++) {
            std::cin >> this->scores[i];
        }
    }

    int calculateTotalScore() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += this->scores[i];
        }
        return sum;
    }
};

int main() {
    int numOfStudents;
    std::cin >> numOfStudents;

    Student* student = new Student[numOfStudents];

    for (int i = 0; i < numOfStudents; i++) {
        student[i].input();
    }

    int count = 0;
    for (int i = 1; i < numOfStudents; i++) {
        if (student[0].calculateTotalScore() < student[i].calculateTotalScore()) {
            count++;
        }
    }

    std::cout << count << std::endl;

    return 0;
}