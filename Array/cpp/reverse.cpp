#include <iostream>
using namespace std;

void printArray(int a[], int n) {
  cout << "The reversed array is:- " << endl;
   for (int i = 0; i < n; i++) {
      cout << a[i] << " ";
   }
}

void reverseArray(int arr[], int n) {
   int a[n];
   for (int i = n - 1; i >= 0; i--) {
      a[n - i - 1] = arr[i];
   }
   printArray(a, n);
}
int main() {
   int n = 5;
   int arr[] = {5,4,3,2,1};
   reverseArray(arr, n);
   return 0;
}