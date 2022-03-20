//Selection sort , not stable , in place (not require for extra space)
#include <iostream>
using namespace std;

void SelectionSort(int arr[],int n){
    for(int i=0; i<n; i++){
        int min=i;// update
        for(int j=i+1; j<n; j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        swap(arr[min],arr[i]);//new upadated min
    }
}
int main()
{
    int a[5]={23,35,12,44,22};
    int n=5;
    SelectionSort(a,n);
    for(int i=0; i<n; i++)
        cout<<a[i]<<" ";
    cout<<endl;
    
    return 0;
}