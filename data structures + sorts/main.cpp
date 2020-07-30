#include <iostream>
#include <string>
#include <stdlib.h>
#include <ctime>
#include <stack>
using namespace std;

void fillArray(int array[], int size) {
	for (int i = 0; i < size; i++) {
		array[i] = rand() % 20 + 1;
	}
}

void deleteArray(int array[]) {
	delete[] array;
}

void showArray(int array[], int size) {

	cout << "Array contents: " << endl;

	for (int i = 0; i < size; i++) {
		cout << "Index " << i << ": " << array[i] << endl;
	}
	cout << endl;
}

int main() {

	// generates a true random seed
	srand(time(NULL));

	// initialize array
	int size;
	cout << "Insert size for your array" << endl;
	cin >> size;
	int* array = new int[size];

	fillArray(array, size);
	showArray(array, size);

	deleteArray(array);
	system("pause");
	return 0;
}
