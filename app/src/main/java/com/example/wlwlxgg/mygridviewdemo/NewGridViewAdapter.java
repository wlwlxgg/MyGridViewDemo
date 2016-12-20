package com.example.wlwlxgg.mygridviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by wlwlxgg on 2016/12/14.
 */

public class NewGridViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Test> mList;
    /*当前类*/
    private ArrayList<Test> list;
    /**
     * 将传入的list根据类别拆分
     */
    private ArrayList<Test> list_1 = new ArrayList<>();
    private ArrayList<Test> list_2 = new ArrayList<>();
    private ArrayList<Test> list_3 = new ArrayList<>();
    private ArrayList<Test> list_4 = new ArrayList<>();
    private ArrayList<Test> list_5 = new ArrayList<>();
    private ArrayList<Test> list_6 = new ArrayList<>();
    private ArrayList<Test> list_7 = new ArrayList<>();
    private ArrayList<Test> list_8 = new ArrayList<>();
    private ArrayList<Test> list_9 = new ArrayList<>();

    private int tag;

    public NewGridViewAdapter(Context context, ArrayList<Test> list, ArrayList<Test> mList, int tag) {
        this.context = context;
        this.list = list;
        this.tag = tag;
        this.mList = mList;
    }



    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        ViewHolder viewHolder = null;
        if (convertView != null) {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        else {
            view = View.inflate(context, R.layout.activity_application_all_item, null);
            viewHolder = new ViewHolder();
            viewHolder.iv = (ImageView) view.findViewById(R.id.image_view_grid_view);
            viewHolder.delete = (ImageView) view.findViewById(R.id.delete_application);
            viewHolder.selected = (ImageView) view.findViewById(R.id.selected_application);
            viewHolder.add = (ImageView) view.findViewById(R.id.add_application);
            viewHolder.tv = (TextView) view.findViewById(R.id.text_view_grid_view);
            view.setTag(viewHolder);
        }
        if (tag == 1) {
            viewHolder.add.setVisibility(View.INVISIBLE);
            viewHolder.delete.setVisibility(View.INVISIBLE);
            viewHolder.selected.setVisibility(View.INVISIBLE);
            viewHolder.iv.setBackgroundResource(list.get(position).getImgId());
            viewHolder.tv.setText(list.get(position).getTitle());
        }else {
            viewHolder.iv.setBackgroundResource(list.get(position).getImgId());
            viewHolder.tv.setText(list.get(position).getTitle());
            /**
             * 如果可以修改，则要去判断是否在常用类
             * 1、如果当前是常用类里的可修改项目则显示-
             * 2、如果当前是非常用类的项目
             *  a.如果当前项目在常用类里也存在，则当前项目显示>
             *  b.如果当前项目不在常用类，则显示+
             */
            if(list.get(position).getCanModify()) {
                if(list.get(position).getType() == 1) {
                    boolean b = false;
                    for (int i = 0; i < mList.size(); i++) {
                        if (mList.get(i).getTitle() == list.get(position).getTitle()) {
                            b = true;
                        }
                    }
                    if (b) {
                        viewHolder.delete.setVisibility(View.VISIBLE);
                        viewHolder.add.setVisibility(View.INVISIBLE);
                        viewHolder.selected.setVisibility(View.INVISIBLE);
                    }
                    else {
                        viewHolder.add.setVisibility(View.VISIBLE);
                        viewHolder.delete.setVisibility(View.INVISIBLE);
                        viewHolder.selected.setVisibility(View.INVISIBLE);
                    }
                } else {
                    boolean b = false;
                    for (int i = 0; i < mList.size(); i++) {
                        if (mList.get(i).getTitle() == list.get(position).getTitle()) {
                            b = true;
                        }
                    }
                    if (b) {
                        viewHolder.selected.setVisibility(View.VISIBLE);
                        viewHolder.add.setVisibility(View.INVISIBLE);
                        viewHolder.delete.setVisibility(View.INVISIBLE);
                    }else {
                        viewHolder.add.setVisibility(View.VISIBLE);
                        viewHolder.delete.setVisibility(View.INVISIBLE);
                        viewHolder.selected.setVisibility(View.INVISIBLE);
                    }
                }

            }
        }
        return view;
    }

    class ViewHolder {
        public ImageView iv, delete, selected, add;
        public TextView tv;
    }
}
