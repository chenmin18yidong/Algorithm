package net.lzzy.algorithm.algorilb;

import java.util.ArrayList;

/**
 * Created by lzzy_gxy on 2019/6/13.
 * Description:
 */
public class DireadSort {
    private  Integer[]items;
    private int swapCount;//交换次数
    private long duration;//运行时长
    private int  compareCount;//比较次数
    private int movesetp;//移动次数
    //对比次数
   public DireadSort(Integer[]items){
        this.items=items;
        compareCount=0;
        movesetp=0;
    }
    public int compareTo(Object o){
       return 0;
    }
    boolean bigger(Integer a,Integer b){
        compareCount++;
        return a.compareTo(b)>0;
    }
    public boolean comparetwo(int a,int b){
       compareCount++;
       return a>b?true:false;
    }
      public  void swap(int i, int j){
        int temp=items[i];
        items [i]=items[j];
        items[j]=temp;
        swapCount++;
    }
    public  String  getResult() {
        String display = "";
        for (Integer i : items) {
            display = display.concat(i + ",");
        }
        return display.substring(0,display.length()-1);
    }
    public  void ddd() {
        long starttime=System.currentTimeMillis();
        for(int i=0;i<items.length-1;i++){
            int min=i;
            for(int j=i+1;j<items.length;j++){
            if(items[min].compareTo(items[j])>0){
            min=j;
            }}
            swap(min,i);
        }
        duration=System.currentTimeMillis()-starttime;
    }


    public  long getDuration(){
        return  duration;
}
public  int getCompareCunt()
{
    return compareCount;
}
public  int getMovesetp(){
        return movesetp;
    }


}
