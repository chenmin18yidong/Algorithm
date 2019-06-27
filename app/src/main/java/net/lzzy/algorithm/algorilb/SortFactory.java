package net.lzzy.algorithm.algorilb;

/**
 * Created by lzzy_gxy on 2019/6/27.
 * Description:
 */
public class SortFactory {
    public  static <T extends Comparable<?super T>> BaseSort<T >getInstance(int key,T[]items){
        BaseSort<T>sort;
        switch (key){
            case 0:
                sort=new DirectSort<>(items);
                break;
            case 1:
                sort=new InsertSort<>(items);
                break;
            case 2:
                sort=new ShellSort<>(items);
                break;
                default:
                    return null;
        }
        return sort;
}
public static String []getSortName(){
    return new String[] {"选择拍戏","插入排序","希尔排序"};
    }
}
