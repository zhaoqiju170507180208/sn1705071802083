package cn.edu.sdwu.android.classroom.sn170507180208;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

//商品列表 每个商品有三项
public class Ch7Activity3 extends AppCompatActivity {
    private ArrayList list;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch7_3);

        //准备数据
        list=new ArrayList();
        HashMap hashMap=new HashMap();
        hashMap.put("name","goods1");
        hashMap.put("price","50");
        hashMap.put("img", R.drawable.img);
        list.add(hashMap);
        hashMap=new HashMap();
        hashMap.put("name","goods2");
        hashMap.put("price","200");
        hashMap.put("img", R.drawable.img);
        list.add(hashMap);
        hashMap=new HashMap();
        hashMap.put("name","goods3");
        hashMap.put("price","10");
        hashMap.put("img", R.drawable.img);
        list.add(hashMap);//三个商品都添加到了list中
        //实例化适配器
        simpleAdapter=new SimpleAdapter(this,list, R.layout.layout_goods,new String[]{"name","price","img"},new int[]{R.id.goods_name, R.id.goods_price, R.id.goods_img});
        //设置到listView中
        ListView listView=(ListView)findViewById(R.id.ch7_3_lv);
        listView.setAdapter(simpleAdapter);
        //刷新：simpleAdapter.notifyDataSetChanged();

    }
}
