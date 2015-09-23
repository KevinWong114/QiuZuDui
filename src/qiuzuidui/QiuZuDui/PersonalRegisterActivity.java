package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by getkong on 2015/8/12.
 */
public class PersonalRegisterActivity extends Activity {

    ImageButton personal_register_activity_Btn_back = null;
    ImageButton personal_register_activity_Btn_personal = null;
    ImageButton personal_register_activity_Btn_org = null;
    EditText personal_register_activity_Edt_userName = null;
    EditText personal_register_activity_Edt_password = null;
    EditText personal_register_activity_Edt_emailaddress = null;
    ImageButton personal_register_activity_Btn_register = null;

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.personal_register_activity);

        initWidget();
    }

    public void initWidget() {
        //后退按钮
        personal_register_activity_Btn_back = (ImageButton)findViewById(R.id.personal_register_activity_Btn_back);
        //个人用户按钮
        personal_register_activity_Btn_personal = (ImageButton)findViewById(R.id.personal_register_activity_Btn_personal);
        //组织用户按钮
        personal_register_activity_Btn_org = (ImageButton)findViewById(R.id.personal_register_activity_Btn_org);
        personal_register_activity_Btn_org.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PersonalRegisterActivity.this, OrgRegisterActivity.class);
                startActivity(intent);
            }
        });
        //用户名输入框
        personal_register_activity_Edt_userName = (EditText)findViewById(R.id.personal_register_activity_Edt_userName);
        //密码输入框
        personal_register_activity_Edt_password = (EditText)findViewById(R.id.personal_register_activity_Edt_password);
        //电子邮箱输入框
        personal_register_activity_Edt_emailaddress = (EditText)findViewById(R.id.personal_register_activity_Edt_emailaddress);
        //注册按钮
        personal_register_activity_Btn_register = (ImageButton)findViewById(R.id.personal_register_activity_Btn_register);
    }

}
