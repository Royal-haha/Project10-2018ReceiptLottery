package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        c_page();
    }
    //回到月份選擇
    public void re_month(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    //上一頁
    public void re_number(View v){
        finish();
    }
    private void c_page(){
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null){
            num = Integer.parseInt(bundle.getString("winNum"));
            TextView textView = (TextView)findViewById(R.id.money);
            //中獎金額
            if (num == 368){
                textView.setText("2000元");
            }
            else if (num == 524){
                textView.setText("1000元");
            }
            else if (num == 622){
                textView.setText("200元");
            }
            else if (num == 723){
                textView.setText("200元");
            }
            else if (num == 652){
                textView.setText("10元");
            }
            else if (num == 222){
                textView.setText("2000元");
            }
            else if (num == 555){
                textView.setText("1000元");
            }
            else if (num == 666){
                textView.setText("200元");
            }
            else if (num == 777){
                textView.setText("200元");
            }
            else if (num == 888){
                textView.setText("10元");
            }
            else if (num == 200){
                textView.setText("2000元");
            }
            else if (num == 201){
                textView.setText("1000元");
            }
            else if (num == 202){
                textView.setText("200元");
            }
            else if (num == 203){
                textView.setText("200元");
            }
            else if (num == 204){
                textView.setText("10元");
            }
            else if (num == 300){
                textView.setText("2000元");
            }
            else if (num == 301){
                textView.setText("1000元");
            }
            else if (num == 302){
                textView.setText("200元");
            }
            else if (num == 303){
                textView.setText("200元");
            }
            else if (num == 304){
                textView.setText("10元");
            }
            else if (num == 123){
                textView.setText("2000元");
            }
            else if (num == 456){
                textView.setText("1000元");
            }
            else if (num == 789){
                textView.setText("200元");
            }
            else if (num == 235){
                textView.setText("200元");
            }
            else if (num == 365){
                textView.setText("10元");
            }
            else if (num == 500){
                textView.setText("2000元");
            }
            else if (num == 501){
                textView.setText("1000元");
            }
            else if (num == 502){
                textView.setText("200元");
            }
            else if (num == 503){
                textView.setText("200元");
            }
            else if (num == 504){
                textView.setText("10元");
            }
            else
                textView.setText("可惜~再接再厲!");
        }
    }
}