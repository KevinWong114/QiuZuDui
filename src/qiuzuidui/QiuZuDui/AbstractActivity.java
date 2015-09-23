package qiuzuidui.QiuZuDui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import qiuzuidui.QiuZuDui.Object.Competition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by getkong on 2015/9/7.
 */
public class AbstractActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener{

    private SwipeRefreshLayout mSwipeLayout;
    private ListView mListView;
    public ListViewAdapter mAdapter;
    private List<Competition> competitionList;

    @Override
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);
        setContentView(R.layout.abstract_activity);


        mSwipeLayout = (SwipeRefreshLayout)findViewById(R.id.abstract_activity_swipeRefreshLayout);
        mSwipeLayout.setOnRefreshListener(this);
        mSwipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light,
             android.R.color.holo_blue_bright, android.R.color.holo_orange_light);

        competitionList = new ArrayList<Competition>();
        competitionList.add(new Competition("活动", "描述", R.drawable.xsearch_loading));
        competitionList.add(new Competition("活动", "描述", R.drawable.xsearch_loading));
        mAdapter = new ListViewAdapter(this, competitionList);

        mListView = (ListView)findViewById(R.id.abstract_activity_listview);
        mListView.setAdapter(mAdapter);

        initButtonBack();
    }

    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeLayout.setRefreshing(false);

                Competition mCompetition = new Competition("new", "new", R.drawable.xsearch_loading);
                competitionList.add(mCompetition);

                mAdapter.notifyDataSetChanged();
                //Log.d("Size:", ""+competitionList.size());
            }
        }, 500);
    }

    public void initButtonBack() {
        ImageButton ImgBtn = (ImageButton)findViewById(R.id.abstract_activity_Btn_back);
        ImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AbstractActivity.this, MainActivity.class);
                startActivity(intent);
                AbstractActivity.this.finish();
            }
        });
    }

    public TextView alabGetTextViewTitle() {
        return (TextView)findViewById(R.id.abstract_activity_Textview_title);
    }

    public boolean alabSetTitle(String title) {
        TextView tv = (TextView)findViewById(R.id.abstract_activity_Textview_title);
        if (tv != null) {
            tv.setText(title);
            return true;
        }
        return false;
    }

    public void alabSetContentView(int layoutResId) {
        LinearLayout llContent = (LinearLayout)findViewById(R.id.abstract_activity_LinearLayout_content);
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(layoutResId, null);
        llContent.addView(v);
    }

    public class ListViewAdapter extends ArrayAdapter<Competition> {
        //private View[] itemViews;
        private LayoutInflater inflater;

        public ListViewAdapter(Context context, List<Competition> competitions) {
            super(context, 0, competitions);
            inflater = LayoutInflater.from(context);

            //itemViews = new View[competitions.size()];

            //for(int i = 0; i < itemViews.length; i++) {
            //    itemViews[i] = makeItemView(competitions.get(i));
            //}
        }

        /**
        public int getCount() {
            return itemViews.length;
        }
         */
        /**
        public View getItem(int position) {
            return itemViews[position];
        }
         */

        public long getItemId(int position) {
            return position;
        }

        private View makeItemView(Competition competition) {
            LayoutInflater inflater = (LayoutInflater)AbstractActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = inflater.inflate(R.layout.listview_item_activity, null);

            TextView name = (TextView)itemView.findViewById(R.id.listview_item_activity_title);
            name.setText(competition.getName());
            TextView description = (TextView)itemView.findViewById(R.id.listview_item_activity_description);
            description.setText(competition.getDescription());
            ImageView image = (ImageView)itemView.findViewById(R.id.listview_item_activity_itemImage);
            image.setImageResource(competition.getImageId());

            return itemView;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Competition competition = getItem(position);

            if(convertView == null) {
               // return itemViews[position];
                convertView = inflater.inflate(R.layout.listview_item_activity, null);
            }

            TextView name = (TextView)convertView.findViewById(R.id.listview_item_activity_title);
            name.setText(competition.getName());
            TextView description = (TextView)convertView.findViewById(R.id.listview_item_activity_description);
            description.setText(competition.getDescription());
            ImageView image = (ImageView)convertView.findViewById(R.id.listview_item_activity_itemImage);
            image.setImageResource(competition.getImageId());

            return convertView;
        }
    }
}



