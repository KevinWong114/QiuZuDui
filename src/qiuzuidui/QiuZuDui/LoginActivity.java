package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by getkong on 2015/8/5.
 */
public class LoginActivity extends Activity {

    EditText Edt_userName = null;
    EditText Edt_password = null;
    ImageButton Btn_login = null;
    CheckBox Chb_isRememberPassword = null;
    Button Btn_isForgetPassword = null;
    Button Btn_register = null;
    Button Btn_haveALook = null;

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.login_activity);

        initWidget();
    }

    public void initWidget() {
        //用户名输入框
        Edt_userName = (EditText)findViewById(R.id.Edt_userName);
        String userName = Edt_userName.getText().toString();
        //密码输入框
        Edt_password = (EditText)findViewById(R.id.Edt_password);
        String password = Edt_password.getText().toString();
        //登录按钮
        Btn_login = (ImageButton)findViewById(R.id.Btn_login);
        Btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //记住密码选项
        Chb_isRememberPassword = (CheckBox)findViewById(R.id.Chb_isRememberPassword);
        //忘记密码按钮
        Btn_isForgetPassword = (Button)findViewById(R.id.Btn_isForgetPassword);
        //注册账号按钮
        Btn_register = (Button)findViewById(R.id.Btn_register);
        Btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this, PersonalRegisterActivity.class);
                startActivity(intent);
            }
        });
        //随便看看按钮
        Btn_haveALook = (Button)findViewById(R.id.Btn_haveALook);
    }
}
