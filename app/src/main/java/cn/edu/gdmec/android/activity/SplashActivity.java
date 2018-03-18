package cn.edu.gdmec.android.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import cn.edu.gdmec.android.R;

/**
 * Created by lenovo on 2018/3/18.
 */

public class SplashActivity extends AppCompatActivity {
    TextView tv_version;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();

    }
    private void init(){
tv_version = (TextView)findViewById(R.id.tv_version);
try{
    PackageInfo info = getPackageManager().getPackageInfo(getPackageName(),0);
    tv_version.setText("V"+info.versionName);
}catch (PackageManager.NameNotFoundException e){
e.printStackTrace();
tv_version.setText("V");
}
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        };
        timer.schedule(task,3000);
    }
}
