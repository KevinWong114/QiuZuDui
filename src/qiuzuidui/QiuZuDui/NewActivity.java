package qiuzuidui.QiuZuDui;

import android.os.Bundle;

/**
 * Created by getkong on 2015/9/8.
 */
public class NewActivity extends AbstractActivity {
    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setTopTitle();
    }

    public void setTopTitle() {
        alabSetTitle("最新活动");
    }
}
