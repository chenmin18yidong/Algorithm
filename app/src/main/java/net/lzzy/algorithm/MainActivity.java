package net.lzzy.algorithm;

import android.accounts.AbstractAccountAuthenticator;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import net.lzzy.algorithm.algorilb.DireadSort;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Integer[] items;
    private EditText edtItems,et1;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        edtItems = findViewById(R.id.activity_main_edt_items);
        findViewById(R.id.activity_main_btn_generate).setOnClickListener(this);
        findViewById(R.id.activity_main_btn_sort).setOnClickListener(this);
        findViewById(R.id.bt1).setOnClickListener(this);
        tvResult = findViewById(R.id.activity_main_tv_result);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_btn_generate:
                generateItems();
                displayItems(edtItems);
                break;
            case R.id.activity_main_btn_sort:
                DireadSort sort=new DireadSort(items);
                sort.ddd();
                items.s
                new AlertDialog().
                sort.getDuration();
                displayItems(tvResult);
                break;
            case R.id.bt1:


                displayItems(et1);
                default:
                break;
        }
    }

  /*  private void AAA() {
        DireadSort aa=new DireadSort();
        /*for(int i=1;i<items.length;i++){
            int j=i-1;
            if(items[j].compareTo(items[i])<0){
                continue;
            }
            Integer temp=items[i];
            while (j>=0&&items[j].compareTo(temp)>0){
                items[j+1]=items[j];
                j--;

            }
            items[j+1]=temp;
        }}*/
        // 定义一个i为0；
        /*for(int i = 0;i <items.length;i++){
            int k = i;
            for(int j = i+1;j < items.length;j++){
                if(items[j] < items[k]){
                   k= j;
                }
            }

           if(k != i){

                int temp = 0;
                temp = items[i];
               items[i] = items[k];
                items[k] = temp;
            }
        }*/



    private void displayItems(TextView tv) {
        String display = "";
        for (Integer i : items) {
            display = display.concat(i + ",");
        }
        display = display.substring(0, display.length() - 1);
        tv.setText(display);
    }
    private void directSort() {
        //todo:直接选择排序的具体实现
        //分为有序区和无序区，每一趟排序都在无序区依次对比，记录对比区域的最小元素的位置
        //然后把无序区第一个元素的最小元素进行交换，无序区少=一个，有序区多一个，循环往复至无序区
        //for(int i=0;i<items.length-1;i++){
        //int min=i;
        //for(int j=i+1;j<items.length;j++){
        //if(itms[min].coparTO(items[j])>0){
        //min=j;
        //}}
        //swap(min,i)
       /* for(int i=0; i<items.length; i++) {
            for(int j=i+1; j<items.length; j++) {
                if(items[i] <items[j]) {
                    int temp = items[i];
                    items[i]=  items[j];
                    items[j]=  temp;
                }
            }
        }*/
    }
    private void generateItems() {
        items = new Integer[10];
        Random generator = new Random();
        for (int i = 0; i < items.length; i++) {
            items[i] = generator.nextInt(99);
        }

    }
}
