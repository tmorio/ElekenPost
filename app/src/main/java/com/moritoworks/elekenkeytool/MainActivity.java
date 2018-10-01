package com.moritoworks.elekenkeytool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ボタン定義
        final Button buttona = (Button)findViewById(R.id.opendoor);
        final Button buttonb = (Button)findViewById(R.id.closedoor);

        //借りたボタンイベント
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttona.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        buttona.setEnabled(true);
                    }
                }, 5000L);
                //ボタンイベント内容(A)
                AsyncTaskGet task = new AsyncTaskGet();
                task.execute("");
                Toast toast = Toast.makeText(MainActivity.this, "受け取りメッセージを送信しました", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        //返したボタンイベント
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonb.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        buttonb.setEnabled(true);
                    }
                }, 5000L);
                //ボタンイベント内容(B)
                AsyncTaskReturn task = new AsyncTaskReturn();
                task.execute("");
                Toast toast = Toast.makeText(MainActivity.this, "返却メッセージを送信しました", Toast.LENGTH_LONG);
                toast.show();
            }
        });


    }
}
