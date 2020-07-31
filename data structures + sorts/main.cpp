/*
	Luke Kim

	practicing: bubble sort, insertion sort, selection sort, quick sort, merge sort

	also: will be tracking their time complexities and comparing them to each other

*/

#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>
using namespace std;

void fillArray(int array[], int size) {
	for (int i = 0; i < size; i++) {
		array[i] = rand() % 200 + 1;
	}
}

void deleteArray(int array[]) {
	delete[] array;
}

void showArray(int array[], int size) {

	cout << "\nArray contents: " << endl;

	for (int i = 0; i < size; i++) {
		cout << array[i] << " ";
	}
	cout << endl;
}

// bubble sort
void bubbleSort(int array[], int size) {
	int temp = 0;
	for (int i = 0; i < size - 1; i++) {
		
		for (int j = 0; j < size - i - 1; j++) {
			if (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}		
	}
}

int main() {

	// generates a true random seed
	srand(time(NULL));

	double bubbleTime, insertionTime, selectionTime, quickTime, mergeTime;
	clock_t start, end;

	// initialize the array
	int size;
	cout << "Insert size for your array" << endl;
	cin >> size;
	int* array = new int[size];

	fillArray(array, size);
	//showArray(array, size);

	start = clock();
	bubbleSort(array, size);
	end = clock();
	
	bubbleTime = (double)(end - start) / CLOCKS_PER_SEC;
	cout << "\nTIME ELAPSED FOR BUBBLE SORT OF SIZE " << size << ": " << bubbleTime << " seconds" << endl;
	//showArray(array, size);

	deleteArray(array);
	system("pause");
	return 0;
}
