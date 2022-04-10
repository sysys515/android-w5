package com.example.day6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkboxEvent2(View v) {
        CheckBox cb1=findViewById(R.id.checkBox1);
        CheckBox cb2=findViewById(R.id.checkBox2);
        CheckBox cb3=findViewById(R.id.checkBox3);

        int money=0,m1=0,m2=0,m3=0;

        TextView t1=(TextView) findViewById(R.id.textView3);

        if(cb1.isChecked()) { m1=500; }
        if(cb2.isChecked()) { m2=700; }
        if(cb3.isChecked()) { m3=900; }

        money=m1+m2+m3;

        t1.setText("총 금액은"+money+"원 입니다.");
    }

    public void checkboxEvent(View v) {

        TextView t1=(TextView)findViewById(R.id.textView3);

        switch(v.getId()) {
            case R.id.checkBox1:
                boolean checked1=((CheckBox)v).isChecked();
                if(checked1) {
                    t1.setText("오렌지를 선택하셨습니다");
                } else {
                    t1.setText("오렌지를 선택 취소하셨습니다");
                }
                break;
            case R.id.checkBox2:
                boolean checked2=((CheckBox)v).isChecked();
                if(checked2) {
                    t1.setText("키위를 선택하셨습니다");
                } else {
                    t1.setText("키위를 선택 취소하셨습니다");
                }
                break;
            case R.id.checkBox3:
                boolean checked3=((CheckBox)v).isChecked();
                if(checked3) {
                    t1.setText("수박을 선택하셨습니다");
                } else {
                    t1.setText("수박을 선택 취소하셨습니다");
                }
                break;
        }
    }

    public void backgroundEvent(View v) {
        ConstraintLayout layout=(ConstraintLayout)findViewById(R.id.c_layout);
        boolean checked=((RadioButton)v).isChecked();

        switch(v.getId()) {
            case R.id.radioButton1:
                if(checked) {
                    layout.setBackgroundResource(R.drawable.back1);
                    //layout.setBackgroundColor(Color.GREEN);
                }
                break;

            case R.id.radioButton2:
                if(checked) {
                    layout.setBackgroundResource(R.drawable.back2);
                    //layout.setBackgroundColor(Color.YELLOW);
                }
                break;

            case R.id.radioButton3:
                if(checked) {
                    layout.setBackgroundResource(R.drawable.back3);
                    //layout.setBackgroundColor(Color.RED);
                }
                break;
        }
    }

}