import java.util.Arrays;

public class _2MaxHeap {
    private int[] Heap;
    private int size;
    private int MaxSize;

    public static void main(String[] args) {
        _2MaxHeap t=new _2MaxHeap(7);

        t.Heap=new int[]{30, 7, 13, 21, 16, 12, 9};
        t.size=t.Heap.length;// update current array size

        System.out.println("Before build : "+Arrays.toString(t.Heap));
        t.buildHeap();
        System.out.println("After build : "+Arrays.toString(t.Heap));
        t.printHeap();
    }
    public _2MaxHeap(int MaxSize) {// constructor
        this.MaxSize = MaxSize;
        this.size = 0;
        Heap = new int[MaxSize];
    }
    public void heapify(int pos){
        if(!isLeaf(pos)) {// heapify doesn't use in leaf node

            if(Heap[left(pos)] > Heap[pos] || Heap[right(pos)] > Heap[pos]){

                // If left child is larger than right child
                if(Heap[left(pos)] > Heap[right(pos)]){
                    swap(pos,left(pos));// Swap with the left child and heapify
                    heapify(left(pos));// Recursively heapify the affected sub-tree
                }
                // Swap with the right child and heapify
                else{
                    swap(pos,right(pos));
                    heapify(right(pos));
                }
            }
        }
    }
    public void buildHeap(){
        for(int i=(size/2)-1; i>=0; i--){
            heapify(i);
        }
    }
    public void printHeap(){
        for(int i=0; i<=(size/2)-1; i++){// [note] Index of last non-leaf node : (size/2)-1
            System.out.print("Parent : "+Heap[i]);
            if(left(i)<size)
                System.out.print("  Left : "+Heap[left(i)]);
            if(right(i)<size)
                System.out.print("  Right : "+Heap[right(i)]);
            System.out.println();
        }
    }
    private void swap(int a,int b){
        int temp=Heap[a];
        Heap[a]=Heap[b];
        Heap[b]=temp;
    }
    private int left(int i) {
        return (i * 2) + 1;
    }
    private int right(int i) {
        return (i * 2) + 2;
    }
    private int parent(int i) {
        return (i - 1) / 2;
    }
    private boolean isLeaf(int i){
        return (right(i)>=MaxSize || left(i)>=MaxSize);
    }
    // it detects leaf node
    //it returns true if i is index of leaf node
}