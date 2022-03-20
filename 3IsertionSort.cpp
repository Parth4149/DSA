//Insertion sort is mostly used in small size array
#include <iostream>
using namespace std;
void IsertionSort(int arr[],int n){
    for(int i=1; i<n; i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
}
int main()
{
    int a[6]={20,5,40,60,10,30};
    int n=6;
    IsertionSort(a,n);
    for(int i=0; i<n; i++)
        cout<<a[i]<<" ";
    cout<<endl;
    return 0;
}