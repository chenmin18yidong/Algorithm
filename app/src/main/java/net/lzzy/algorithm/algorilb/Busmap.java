package net.lzzy.algorithm.algorilb;

import android.util.SparseArray;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by lzzy_gxy on 2019/7/8.
 * Description:
 */
public class Busmap extends SimpleMap {
    private SparseArray<String>vertexes;
    private double minDistance;
    private int start,target;
    public Busmap(int v){
        super(v);
        vertexes=new SparseArray<>();
        for(int i=0;i<v;i++){
            vertexes.append(i,String.valueOf(i));

        }
    }
    public void setStart(int start){
        this.start=start;
    }
    public void  setTarget(int target){
        this.target=target;
    }
    public void rename(int i, String name){
        vertexes.setValueAt(i,name);
    }
    //1.深度优先的方式尝试从当前节点到达目的地，记录路径长度
    private void tryWay(int curVertec,double distance){
if(minDistance>0&&distance>minDistance){
    return;
}
if(curVertec==target){
    if(minDistance==0||minDistance>distance){
        minDistance=distance;
    }
    return;
        }
        List<Edge> vEdges=getCounnectedEdge(curVertec);
for(Edge edge: vEdges){
    if(vidited.contains(edge.getTarget())){
        continue;
    }
   vidited.add(edge.getTarget());
        tryWay(edge.getTarget(),distance+edge.getDistance());
        vidited.remove(edge.getTarget());

}
    }

    private List<Edge> getCounnectedEdge(int curVertec) {
        return edges;
    }
    //2.Floyd算法求最短路径


//3.Dijkstra算法求最短路径
private double []dijkstra(int source) {
    double[] distance = new double[vertexCount];
    for (int i = 0; i < vertexCount; i++) {
        distance[i] = 999999;
    }
    distance[source] = 0;
    List<Edge> vedge = getCounnectedEdge(source);
    for (Edge edge : vedge) {
        distance[edge.getTarget()] = edge.getDistance();

    }
    vidited.add(source);
    int shortVertex = source;
    for (int i = 1; i < vertexCount; i++) {
        double shortDistance = 999999;
        for (int j = 0; j < vertexCount; j++) {
            if (vidited.contains(j) || distance[j] >= shortDistance) {
                continue;
            }
            shortDistance = distance[j];
            shortVertex = j;
        }
        vidited.add(shortVertex);
        List<Edge> shortVertesEdges = getConnectedEdges(shortVertex);
        for (Edge edge : shortVertesEdges) {
            if (distance[edge.getTarget()] > distance[shortVertex] + edge.getDistance()) {
                distance[edge.getTarget()] = distance[shortVertex] + edge.getDistance();
            }
        }

    }
  return distance;
}
}