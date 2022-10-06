#include <iostream>
#include <cstdlib>

void update(int* pa, int* pb) {
	int temp = *pa;
	*pa += *pb;
	*pb -= temp;
}

int main() {
	int a, b;
	int* pa = &a, * pb = &b;

	scanf("%d %d", &a, &b);
	update(pa, pb);
	printf("%d\n%d", a, abs(b));

	return 0;
}