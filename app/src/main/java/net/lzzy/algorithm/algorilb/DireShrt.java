package net.lzzy.algorithm.algorilb;

import java.time.Year;

import javax.xml.datatype.Duration;

/**
 * Created by lzzy_gxy on 2019/6/15.
 * Description:
 */
public class DireShrt<T extends Comparable<T>>extends Sdc <T>{
    public  DireShrt(T[]items){
        super(items);
    }
    public  void shrt(){
        long start=System.currentTimeMillis();
        for(int i=0;i<items.legth-1;i++){
            int minPos=i;
            for(int j=i+1;j<items.length;i++){
                if(bigger(items[minPos],items[j])){
                    minPos=j;
                }
            }swap(minPos,i);
        }
        Duration=System.currentTimeMillis()-start;
    }
}