#include<iostream>
using namespace std;

bool Twosum(int arr[], int n, int target) {
    for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
            if(arr[i] + arr[j] == target) {
                return true;
            }
        }
    }
    return false;
}

int main() {
    int n, target;
    cin >> n >> target;

    int arr[n]; 
    for(int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    bool result = Twosum(arr, n, target);

    if(result) {
        cout << "True";
    } else {
        cout << "False";
    }

    return 0;
}
