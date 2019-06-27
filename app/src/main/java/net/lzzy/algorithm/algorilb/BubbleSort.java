package net.lzzy.algorithm.algorilb;

/**
 * Created by lzzy_gxy on 2019/6/27.
 * Description:
 */
public class BubbleSort <T extends Comparable<?super T>>extends BaseSort{
    BubbleSort(Comparable[] items) {
        super(items);
    }

    @Override
    void sort() {
        for(int i=0;i<items.length-1;i++){
            boolean exchangge=false;
            for(int j=items.length-2;j>=i;j--){
                if(bigger(items[j],items[j+1])){
                    swap(j,i+1);
                    exchangge=true;
                }
            }
            if(!exchangge){
               break;
            }
        }

    }
}
