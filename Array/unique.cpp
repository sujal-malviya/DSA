#include<iostream>
using namespace std;
void unique(int arr[],int n)
{
    for(int i =0;i<n;i++)
    {
        for(int j = i+1;j<n;j++)
        {
            if(arr[i] == arr[j])
            {
                
            }
        }
    }
}
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for(int i =0;i<n;i++)
    {
        cin >> arr[i];
    }
    unique(arr,n);
}