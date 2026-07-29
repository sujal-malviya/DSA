#include <iostream>
using namespace std;
void seclargest(int arr[],int n)
{
    
    for(int i = 0;i<n;i++)
    {
       for(int j =i+1;j<n;j++)
       {
           if(arr[i]>arr[j])
           {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       
    }
    cout << "largest = "<<arr[n-2];
    
    
}
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0;i<n;i++)
    {
        cin >> arr[i];
    }
    seclargest(arr,n);

    return 0;
}