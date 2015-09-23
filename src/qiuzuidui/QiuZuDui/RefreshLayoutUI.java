package qiuzuidui.QiuZuDui;

import android.annotation.SuppressLint;
import android.content.Context;
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
 * Created by getkong on 2015/9/18.
 */

public class RefreshLayoutUI extends AbstractActivity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout mSwipeLayout;
    private ListView mListView;
    public ListViewAdapter mAdapter;
    private List<Competition> competitionList;
    String[] names = {"活动1", "活动2","活动3", "活动4", "活动5"};
    String[] descriptions = {"描述1", "描述2", "描述3", "描述4", "描述5"};
    int[] imageIds = {R.drawable.xsearch_loading, R.drawable.xsearch_loading, R.drawable.xsearch_loading, R.drawable.xsearch_loading,
                      R.drawable.xsearch_loading};


    @SuppressLint("InlineApi")
    public void onCreate(Bundle saveInstanceBundle) {
        super.onCreate(saveInstanceBundle);

        mListView = (ListView)findViewById(R.id.test_listview);
        mSwipeLayout = (SwipeRefreshLayout)findViewById(R.id.test_swipeRefreshLayout);
        competitionList = new ArrayList<Competition>();
        competitionList.add(new Competition("活动", "描述", R.drawable.xsearch_loading));


        mAdapter = new ListViewAdapter(competitionList);
        mListView.setAdapter(mAdapter);
        mSwipeLayout.setOnRefreshListener(this);
        mSwipeLayout.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light);
    }

    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mSwipeLayout.setRefreshing(false);

                Competition mCompetition = new Competition();
                mCompetition.setName("new");
                mCompetition.setDescription("new");
                mCompetition.setImageId(R.drawable.xsearch_loading);
                competitionList.add(mCompetition);

                mAdapter.notifyDataSetChanged();
            }
        }, 500);
    }

    public class ListViewAdapter extends BaseAdapter {
        View[] itemViews;

        public ListViewAdapter(List<Competition> competitions) {
            itemViews = new View[competitions.size()];

            for(int i = 0; i < itemViews.length; i++) {
                itemViews[i] = makeItemView(competitions.get(i));
            }
        }

        public int getCount() {
            return itemViews.length;
        }

        public View getItem(int position) {
            return itemViews[position];
        }

        public long getItemId(int position) {
            return position;
        }

        private View makeItemView(Competition competition) {
            LayoutInflater inflater = (LayoutInflater)RefreshLayoutUI.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View itemView = inflater.inflate(R.layout.listview_item_activity, null);

            TextView name = (TextView)itemView.findViewById(R.id.listview_item_activity_title);
            name.setText(competition.getName());
            TextView description = (TextView)itemView.findViewById(R.id.listview_item_activity_description);
            description.setText(competition.getDescription());
            ImageView image = (ImageView)itemView.findViewById(R.id.listview_item_activity_itemImage);
            image.setImageResource(competition.getImageId());

            return itemView;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null) {
                return itemViews[position];
            }
            return convertView;
        }
    }
}
