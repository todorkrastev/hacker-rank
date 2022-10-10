#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
#include <map>
#include <sstream>

int main() {
	int n, q, i;
	std::cin >> n >> q;
	std::string temp;
	std::vector<std::string> hrml;
	std::vector<std::string> quer;
	std::cin.ignore();

	for (i = 0; i < n; i++) {
		std::getline(std::cin, temp);
		hrml.push_back(temp);
	}

	for (i = 0; i < q; i++) {
		std::getline(std::cin, temp);
		quer.push_back(temp);
	}

	std::map<std::string, std::string> m;
	std::vector<std::string> tag;
	for (i = 0; i < n; i++) {
		temp = hrml[i];
		temp.erase(remove(temp.begin(), temp.end(), '\"'), temp.end());
		temp.erase(remove(temp.begin(), temp.end(), '>'), temp.end());

		if (temp.substr(0, 2) == "</") {
			tag.pop_back();
		} else {
			std::stringstream ss;
			ss.str("");
			ss << temp;
			std::string t1, p1, v1;
			char ch;
			ss >> ch >> t1 >> p1 >> ch >> v1;
			std::string temp1 = "";

			if (tag.size() > 0) {
				temp1 = *tag.rbegin();
				temp1 = temp1 + "." + t1;
			} else {
				temp1 = t1;
			}
			tag.push_back(temp1);
			m[*tag.rbegin() + "~" + p1] = v1;

			while (ss) {
				ss >> p1 >> ch >> v1;
				m[*tag.rbegin() + "~" + p1] = v1;
			}
		}
	}
	for (i = 0; i < q; i++) {
		if (m.find(quer[i]) == m.end()) {
			std::cout << "Not Found!\n";
		} else {
			std::cout << m[quer[i]] << std::endl;
		}
	}
	return 0;
}


/*
#include <iostream>
#include <regex>
#include <sstream>
#include <string>
#include <vector>

int main() {

	std::regex regexp("[<>/=\"]*");
	std::regex trim("\\s+");


	std::vector<std::pair<std::string, std::vector<std::pair<std::string, std::vector<std::string>>>>> tags;

	int hmrls, queries;

	std::cin >> hmrls >> queries;
	std::cin.ignore();

	for (size_t i = 0; i < hmrls; i++) {
		std::string input;
		std::getline(std::cin, input);
		std::stringstream result;
		std::regex_replace(std::ostream_iterator<char>(result), input.begin(), input.end(), regexp, "");
		input = std::regex_replace(input, trim, " ");

		std::vector<std::string> tokens;
		std::copy(std::istream_iterator<std::string>(result),
			std::istream_iterator<std::string>(),
			back_inserter(tokens));

		if (1 < tokens.size()) {
			std::string tagInput = tokens[0];

			for (size_t i = 1; i < tokens.size(); i += 2) {
				std::string attrName = tokens[i];
				std::string attrValue = tokens[i + 1];

				int indexTag = -1;
				int indexAttr = -1;

				for (size_t currTag = 0; currTag < tags.size(); currTag++) {
					if (tags[currTag].first == tagInput) {
						indexTag = currTag;

						for (size_t currAttr = 0; currAttr < tags[currTag].second.size(); currAttr++) {
							if (tags[currTag].second[currAttr].first == attrName) {
								indexAttr = currAttr;
								break;
							}
						}
					}
				}

				if (indexTag == -1) {
					std::vector<std::string> attrValues;
					attrValues.push_back(attrValue);

					std::pair<std::string, std::vector<std::string>> attribute;
					attribute.first = attrName;
					attribute.second = attrValues;

					std::vector<std::pair<std::string, std::vector<std::string>>> attributes;
					attributes.push_back(attribute);

					std::pair<std::string, std::vector<std::pair<std::string, std::vector<std::string>>>> tag;
					tag.first = tagInput;
					tag.second = attributes;
					tags.push_back(tag);
				}
				else if (indexAttr == -1) {
					std::vector<std::string> attrValues;
					attrValues.push_back(attrValue);

					std::pair<std::string, std::vector<std::string>> attribute;
					attribute.first = attrName;
					attribute.second = attrValues;


					tags[indexTag].second.push_back(attribute);
				}
				else {
					tags[indexTag].second[indexAttr].second.push_back(attrValue);
				}
			}
		}
	}

	for (size_t i = 0; i < queries; i++) {
		std::string query;
		std::getline(std::cin, query);
		char ch = '.';
		size_t found = query.find_last_of(ch);

		if (found != std::string::npos) {
			query = query.substr(found + 1);
		}

		std::stringstream ss;
		std::regex replaceTilde("~");
		std::regex_replace(std::ostream_iterator<char>(ss), query.begin(), query.end(), replaceTilde, " ");

		std::vector<std::string> tokens;
		std::copy(std::istream_iterator<std::string>(ss),
			std::istream_iterator<std::string>(),
			back_inserter(tokens));

		for (size_t currTag = 0; currTag < tags.size(); currTag++) {
			if (tags[currTag].first == tokens[0]) {
				for (size_t currAttr = 0; currAttr < tags[currTag].second.size(); currAttr++) {
					if (tags[currTag].second[currAttr].first == tokens[1]) {
						for (size_t currValue = 0; currValue < tags[currTag].second[currAttr].second.size(); currValue++) {
							std::cout << tags[currTag].second[currAttr].second[currValue] << std::endl;
						}
					} else {
						std::cout << "Not Found!" << std::endl;
					}
				}
			}
		}

	}

	return 0;
}
*/
