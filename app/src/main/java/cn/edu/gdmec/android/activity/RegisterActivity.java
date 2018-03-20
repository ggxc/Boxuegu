package cn.edu.gdmec.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
private TextView tv_main_title;
private TextView tv_back;
private Button btn_register;
private EditText et_user_name,et_psw_again;
private String userName,psw,pswAgain;
private RelativeLayout rl_title_bar;
private void init(){

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}
