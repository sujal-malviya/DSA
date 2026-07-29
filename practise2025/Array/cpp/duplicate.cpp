#include<iostream>
using namespace std;

void duplicate(int arr[], int n)
{
   for(int i = 0; i < n; i++)
   {
       for(int j = i + 1; j < n; j++)
       {
           if(arr[i] == arr[j])
           {
               cout << "{" << arr[i] << "," << arr[j] << "}" << endl;
               return; 
           }
       }
   }
   cout << "No duplicates found" << endl;
}

int main()
{
    int n;
    cin >> n;

    int arr[n];
    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    duplicate(arr, n);

    return 0;
}
