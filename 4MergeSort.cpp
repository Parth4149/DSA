#include<iostream>
using namespace std;
// time and aux  : theta(n)  // no of levels = log2(no of elements) + 1 // time complexity = theta(nlon(n))
void merge(int a[],int low,int high,int mid);
void mergesort(int a[],int l,int r);
int main()
{
    int a[5]={10,20,5,30,15};
    // merge(a,0,4,2);
    mergesort(a,0,4);
    for(int i=0; i<=4; i++)
        cout<<a[i]<<" ";
    return 0;
}
void mergesort(int a[],int l,int r){// l : left , r : right
    if(l<r){
        int m=(l+r)/2;
        mergesort(a,l,m);
        mergesort(a,m+1,r);
        merge(a,l,r,m);
    }
}
void merge(int a[],int low,int high,int mid){
    int n1=mid-low+1, n2=high-mid;
    int left[n1],right[n2];
    for(int i=0; i<n1; i++)
        left[i]=a[low+i];
    for(int i=0; i<n2; i++)
        right[i]=a[mid+1+i];
        
    int i=0,j=0,k=low;// here,k starts from low
    while(i<n1 && j<n2){
        if(left[i]<=right[j]){
            a[k]=left[i];
            i++;k++;
        }
        else{
            a[k]=right[j];
            j++;k++;
        }
    }
    while(i<n1){
        a[k]=left[i];i++;k++;
    }
    while(j<n2){
        a[k]=right[j];j++;k++;
    }
}