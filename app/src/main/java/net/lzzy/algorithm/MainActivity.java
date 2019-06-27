package net.lzzy.algorithm;

import android.accounts.AbstractAccountAuthenticator;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import net.lzzy.algorithm.algorilb.BaseSort;
import net.lzzy.algorithm.algorilb.DireShrt;
import net.lzzy.algorithm.algorilb.DireShrt;
import net.lzzy.algorithm.algorilb.Sdc;
import net.lzzy.algorithm.algorilb.SortFactory;

import org.w3c.dom.Text;

import java.io.FileDescriptor;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import javax.xml.transform.sax.TransformerHandler;

/**
 * @author Administrator
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Integer[] items;
    private EditText edtItems;
    private TextView tvResult;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtItems=findViewById(R.id.activity_main_edt_items);
        findViewById(R.id.activity_main_btn_generate).setOnClickListener(this);
        findViewById(R.id.activity_main_btn_sort).setOnClickListener(this);
        tvResult = findViewById(R.id.activity_main_tv_result);
        spinner=findViewById(R.id.spinneer);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_btn_generate:
                generateItems();
                displayItems(edtItems);
                break;
            case R.id.activity_main_btn_sort:
                BaseSort<Integer>sort= SortFactory.getInstance(spinner.getSelectedItemPosition(),items);
                BaseSort<Integer>sortnotnull= Objects.requireNonNull(sort);
                sortnotnull.getDuration();
                String resul=sortnotnull.getResult();
                tvResult.setText(resul);
                displayItems(tvResult);
                  new AlertDialog.Builder(MainActivity.this).setTitle("排序完成")
                          .setMessage("对比次数:"+sort.getComparecount()+
                          "\n移动次数:"+sort.getMovestep()+"\n交换次数"+sort.getSwacount()+
                          "\n运行时长:"+sort.getDuration()).show();
                  break;
                default:
                break;
        }
    }

    private void displayItems(TextView tv){
        String display="";
        for(Integer i:items){
            display=display.concat(i+",");
        }
        display=display.substring(0,display.length()-1);
        tv.setText(display);
    }
    private void xier() {

    }

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
