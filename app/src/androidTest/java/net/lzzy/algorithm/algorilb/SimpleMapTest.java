package net.lzzy.algorithm.algorilb;

import android.support.v4.util.SimpleArrayMap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lzzy_gxy on 2019/7/8.
 * Description:
 */
public class SimpleMapTest {


    @Test
    public void iterateDEpthFirst() {
        SimpleMap map=new SimpleMap(6);
        map.addEdge(0,1,1);
        map.addEdge(1,5,1);
        map.addEdge(0,2,1);
        map.addEdge(0,3,1);
        map.addEdge(3,4,1);
        String expcted="015234";
        assertEquals(expcted,map.iterateDEpthFirst());
    }


    @Test
    public void iterateRangeFirst() {
        SimpleMap map=new SimpleMap(6);
        map.addEdge(0,1,1);
        map.addEdge(1,5,1);
        map.addEdge(0,2,1);
        map.addEdge(0,3,1);
        map.addEdge(3,4,1);
        String expcted="0,1,2,3,5,4";
        assertEquals(expcted,map.iterateRangeFirst());    }
}