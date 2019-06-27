package net.lzzy.algorithm.algorilb;

import java.nio.file.attribute.PosixFileAttributes;

/**
 * Created by lzzy_gxy on 2019/6/27.
 * Description:
 */
public class DirectSarch <T extends Comparable<? super T>>extends BaseSarch<T> {
    DirectSarch(T[] items) {
        super(items);
    }

    @Override
    int search(T key) {
        int pos=0;
        for(T items:items){
            if(equal(items,key)){
                return pos;
            }
            pos++;
        }
        return -1;
    }
}
