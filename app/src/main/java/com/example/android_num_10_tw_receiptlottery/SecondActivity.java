package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        b_page();
    }
    //上一頁
    public void back(View v){
        finish();
    }
    private void b_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            String mouth = bundle.getString("mouth");
            num = Integer.parseInt(bundle.getString("numberMouth"));
            TextView text = (TextView)findViewById(R.id.month);
            text.setText(mouth);

            //傳值記述數字代表的中獎號碼
            if (num == 1){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("368" + "\n" + "524" + "\n" + "622" + "\n" + "723" + "\n" + "652");
            }
            else if (num == 2){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("222" + "\n" + "555" + "\n" + "666" + "\n" + "777" + "\n" + "888");
            }
            else if (num == 3){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("200" + "\n" + "201" + "\n" + "202" + "\n" + "203" + "\n" + "204");
            }
            else if (num == 4){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("300" + "\n" + "301" + "\n" + "302" + "\n" + "303" + "\n" + "304");
            }
            else if (num == 5){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("123" + "\n" + "456" + "\n" + "789" + "\n" + "235" + "\n" + "365");
            }
            else if (num == 6){
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("500" + "\n" + "501" + "\n" + "502" + "\n" + "503" + "\n" + "504");
            }
        }
    }
    public void click_BtoC(View v){
        EditText editText = (EditText)findViewById(R.id.editV1);
        Intent intent = new Intent(this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("winNum", editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}