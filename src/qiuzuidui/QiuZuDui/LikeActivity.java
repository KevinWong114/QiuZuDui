package qiuzuidui.QiuZuDui;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by getkong on 2015/9/8.
 */
public class LikeActivity extends AbstractActivity {
    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        alabSetContentView(R.layout.test);
        setTopTitle();

    }

    public void setTopTitle() {
        alabSetTitle("猜你喜欢");
    }

}
