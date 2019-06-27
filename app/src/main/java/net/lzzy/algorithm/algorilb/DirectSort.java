package net.lzzy.algorithm.algorilb;

/**
 * Created by lzzy_gxy on 2019/6/27.
 * Description:
 */
public class DirectSort <T extends Comparable<? super T>>extends  BaseSort{
    DirectSort(Comparable[] items) {
        super(items);
    }

    @Override
    void sort() {
        long start=System.currentTimeMillis();
        for(int i=0;i<items.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<items.length;j++){
                if(bigger(items[minpos],items[j])){
                    minpos=j;
                }swap(minpos,i);
            }
            duration=System.currentTimeMillis()-start;
        }

    }
}
