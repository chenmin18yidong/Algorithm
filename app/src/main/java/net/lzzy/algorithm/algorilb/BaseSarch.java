package net.lzzy.algorithm.algorilb;

/**
 * Created by lzzy_gxy on 2019/6/27.
 * Description:
 */
public abstract  class BaseSarch <T extends Comparable<? super T>> {
    T[]items;
    private long duration;
    private int comparecount;
    private int swapcount;
    int moveSttp;

    BaseSarch(T []items){
        this.items=items;
        comparecount=0;
        swapcount=0;
        moveSttp=0;
    }
    boolean equal(T a,T b){
        comparecount++;
        return a.compareTo(b)==0;
    }
    int compare(T a,T b){
        comparecount++;
        return a.compareTo(b);
    }
    abstract  int search(T key);
    public long getDuration(){
        return duration;
    }
    public void setDuration(long duration){
        this.duration=duration;
    }
    public int getComparecount(){
        return comparecount;
    }
    public void setComparecount(int comparecount){
        this.comparecount=comparecount;
    }
    public int getSwapcount(){
        return swapcount;
    }
}
