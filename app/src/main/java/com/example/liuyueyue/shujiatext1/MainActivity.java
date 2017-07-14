package com.example.liuyueyue.shujiatext1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {
private String TAG ="tag";
    @Override
    //创建
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_text);
        Log.i("tag","MainActivity-->onCreate");
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Secone_activity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    //开始运行
    protected void onStart() {
        super.onStart();
        Log.i("tag","MainActivity-->onStart");
    }

    @Override
    //聚集焦点
    protected void onResume() {
        super.onResume();
        Log.i("tag","MainActivity-->onResume");
    }

    @Override
    //失去焦点
    protected void onPause() {
        super.onPause();
        Log.i("tag","MainActivity-->onPause");
    }

    @Override
    //停止运行
    protected void onStop() {
        super.onStop();
        Log.i("tag","MainActivity-->onStop");
    }

    @Override
    //销毁
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","MainActivity-->onDestroy");
    }

    @Override
    //重启
    protected void onRestart() {
        super.onRestart();
        Log.i("tag","MainActivity-->onRestart");
    }
}
