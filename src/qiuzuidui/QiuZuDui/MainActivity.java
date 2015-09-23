package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/**
 * Created by getkong on 2015/8/17.
 */
public class MainActivity extends Activity {

    RelativeLayout main_activity_btn_like = null;
    RelativeLayout main_activity_btn_new = null;
    RelativeLayout main_activity_btn_hot = null;
    ImageButton main_activity_btn_mainpage = null;
    ImageButton main_activity_btn_navi = null;
    ImageButton main_activity_btn_communication = null;
    ImageButton main_activity_btn_information = null;

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.main_activity);

        initWidget();
    }

    public void initWidget() {
        main_activity_btn_like = (RelativeLayout)findViewById(R.id.main_activity_btn_like);
        main_activity_btn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LikeActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        main_activity_btn_new = (RelativeLayout)findViewById(R.id.main_activity_btn_new);
        main_activity_btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NewActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        main_activity_btn_hot = (RelativeLayout)findViewById(R.id.main_activity_btn_hot);
        main_activity_btn_hot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NewActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
        main_activity_btn_mainpage = (ImageButton)findViewById(R.id.main_activity_btn_mainpage);
        main_activity_btn_navi = (ImageButton)findViewById(R.id.main_activity_btn_navi);
        main_activity_btn_communication = (ImageButton)findViewById(R.id.main_activity_btn_communication);
        main_activity_btn_information = (ImageButton)findViewById(R.id.main_activity_btn_information);

    }
}
