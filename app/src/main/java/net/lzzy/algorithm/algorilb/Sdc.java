package net.lzzy.algorithm.algorilb;

import net.lzzy.algorithm.R;

/**
 * Created by lzzy_gxy on 2019/6/15.
 * Description:
 */
public abstract class Sdc <T extends Comparable<? super T>>{
    T[]items;
    long duration;
    private int swapCount;//交换次数
    private int  compareCount;//比较次数
    private int movesetp;//移动次数


    //对比次数
    Sdc(T[]items){
        this.items=items;
        compareCount=0;
        movesetp=0;
    }
    boolean bigger(Integer a,Integer b){
        compareCount++;
        return a.compareTo(b)>0;
    }
    public  void swap(int a,int b){
        swapCount++;
        T num=items[a];
        items[a]=items[b];
        items[b]=num;
    }
    public String getResult(){
        String display="";
        for(T i:items){
            display=display.concat(i+",");
        }
        return display.substring(0,display.length()-1);
    }
    abstract  void sort();
    public  T[]Return(){
        return items;
    }
    public  int getCompareCount(){
        return compareCount;
    }
    public long getDuration(){
        return duration;
    }
    public int getMovesetp(){
        return movesetp;
    }
    public int getSwapCount(){
        return swapCount;
    }
    }
