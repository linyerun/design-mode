package demo10_strategy.practice;

//ConcreteStrategy
public class QuickSorter implements Sorter{

    @Override
    public void sort(Comparable[] data) {
        if (data.length < 2) return;
        quickSort(0,data.length-1,data);
    }

    private void quickSort(int l, int r,Comparable[] data) {
        if (l >= r) return;
        int randomIdx = l + (int) (Math.random()*(r-l+1));
        swap(data,randomIdx,r);
        int[] p = partition(l, r, data);
        quickSort(l,p[0],data);
        quickSort(p[1],r,data);
    }

    private int[] partition(int L, int R, Comparable[] data) {
        int l = L-1;
        int r = R;
        for (int i = L;i<r;) {
            if (data[i].compareTo(data[R]) == 0) {
                //等于
                i++;
            }else if (data[i].compareTo(data[R])>0) {
                //大于
                swap(data,i,--r);
            }else {
                //小于
                swap(data,i++,++l);
            }
        }
        swap(data,r++,R);
        return new int[]{l,r};
    }

    private void swap(Comparable[] data,int x, int y) {
        Comparable temp = data[x];
        data[x] = data[y];
        data[y] = temp;
    }
}
