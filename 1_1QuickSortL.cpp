// Lomuto Partition // Quick sort
#include <bits/stdc++.h>
using namespace std;
int lPartition(int arr[],int l,int h){// l : low , h : high

    int i=l-1;// i=-1;
    int pivot=arr[h]; // last element (pivot consider as last element)

    for(int j=l; j<=h-1; j++){// j<=h-1, up to second last
        if(arr[j]<pivot){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[h]);
    return (i+1);// position of last element
}
void qSort(int arr[],int l,int h){
    if(l<h){
        int p=lPartition(arr,l,h);
    // for(int i=0; i<=4; i++)
    //     cout<<arr[i]<<" ";
    // cout<<endl;
        qSort(arr,l,p-1);
        qSort(arr,p+1,h);
    }
}
int main()
{
    int a[5]={20,10,40,50,30};
    qSort(a,0,4);
    for(int i=0; i<=4; i++)
        cout<<a[i]<<" ";
    cout<<endl;
    return 0;
}