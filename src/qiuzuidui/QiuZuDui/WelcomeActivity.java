package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class WelcomeActivity extends Activity {

    /**
     * Called when the activity is first created.
     */

    ImageView welcomePage = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.welcome_activity);
        initWelcomePage();
    }

    public void initWelcomePage() {
        welcomePage = (ImageView)findViewById(R.id.welcomePage);
        welcomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(WelcomeActivity.this, LoginActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        });
    }
}
