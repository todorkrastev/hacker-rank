#include <iostream>
#include <string>

class Student {

private:
	int age;
	std::string firstName;
	std::string lastName;
	int standard;

public:
	int getAge() {
		return this->age;
	}

	void setAge(int age) {
		this->age = age;
	}

	std::string getFirstName() {
		return this->firstName;
	}

	void setFirstName(std::string firstName) {
		this->firstName = firstName;
	}

	std::string getLastName() {
		return this->lastName;
	}

	void setLastName(std::string lastName) {
		this->lastName = lastName;
	}

	int getStandard() {
		return this->standard;
	}

	void setStandard(int standard) {
		this->standard = standard;
	}

	std::string toString() {
		return std::to_string(age) + 
			"," + 
			firstName + 
			"," + 
			lastName + 
			"," + 
			std::to_string(standard);
	}

};


int main() {
	int age, standard;
	std::string firstName, lastName;

	std::cin >> age >> firstName >> lastName >> standard;

	Student student;
	student.setAge(age);
	student.setStandard(standard);
	student.setFirstName(firstName);
	student.setLastName(lastName);

	std::cout << student.getAge() << std::endl;
	std::cout << student.getLastName() << ", " << student.getFirstName() << std::endl;
	std::cout << student.getStandard() << std::endl;
	std::cout << std::endl;
	std::cout << student.toString() << std::endl;

	return 0;
}