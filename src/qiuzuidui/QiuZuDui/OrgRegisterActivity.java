package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by getkong on 2015/8/13.
 */
public class OrgRegisterActivity extends Activity {

    ImageButton org_register_activity_Btn_back = null;
    ImageButton org_register_activity_Btn_personal = null;
    ImageButton org_register_activity_Btn_org = null;
    EditText org_register_activity_Edt_orgName = null;
    EditText org_register_activity_Edt_category = null;
    EditText org_register_activity_Edt_emailAddress = null;
    EditText org_register_activity_Edt_phoneNumber = null;
    EditText org_register_activity_Edt_password = null;
    ImageButton org_register_activity_Btn_submit = null;

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.org_register_activity);

        initWidget();
    }

    public void initWidget() {
        //后退按钮
        org_register_activity_Btn_back = (ImageButton)findViewById(R.id.org_register_activity_Btn_back);
        //个人用户按钮
        org_register_activity_Btn_personal = (ImageButton)findViewById(R.id.org_register_activity_Btn_personal);
        org_register_activity_Btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(OrgRegisterActivity.this, PersonalRegisterActivity.class);
                startActivity(intent);
            }
        });
        //组织用户按钮
        org_register_activity_Btn_org = (ImageButton)findViewById(R.id.org_register_activity_Btn_org);
        //组织名字输入框
        org_register_activity_Edt_orgName = (EditText)findViewById(R.id.org_register_activity_Edt_orgName);
        //组织种类输入框
        org_register_activity_Edt_category = (EditText)findViewById(R.id.org_register_activity_Edt_category);
        //组织邮箱输入框
        org_register_activity_Edt_emailAddress = (EditText)findViewById(R.id.org_register_activity_Edt_emailAddress);
        //组织联系人电话输入框
        org_register_activity_Edt_phoneNumber = (EditText)findViewById(R.id.org_register_activity_Edt_phoneNumber);
        //组织密码输入框
        org_register_activity_Edt_password = (EditText)findViewById(R.id.org_register_activity_Edt_password);
        //提交按钮
        org_register_activity_Btn_submit = (ImageButton)findViewById(R.id.org_register_activity_Btn_submit);
    }
}
