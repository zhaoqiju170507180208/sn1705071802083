package cn.edu.sdwu.android.classroom.sn170507180208;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

import static android.R.id.list;

public class Ch7Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch7_1);

        ToggleButton toggleButton=(ToggleButton)findViewById(R.id.ch7_1_tb);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(Ch7Activity1.this,"on", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Ch7Activity1.this,"off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Spinner spinner=(Spinner)findViewById(R.id.ch7_1_spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //参数i:代表当前选中的索引值
                String[] strArr=getResources().getStringArray(R.array.strArr);
                String content=strArr[i];
                Toast.makeText(Ch7Activity1.this,content, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner=(Spinner)findViewById(R.id.ch7_1_spinner2);
        list=new ArrayList();
        list.add("spinnerItem1");
        list.add("spinnerItem2");
        list.add("spinnerItem3");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //参数i:代表当前选中的索引值
                String content=list.get(i).toString();
                Toast.makeText(Ch7Activity1.this,content, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
