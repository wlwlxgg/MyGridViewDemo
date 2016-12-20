package com.example.wlwlxgg.mygridviewdemo;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by wlwlxgg on 2016/12/14.
 * 全部页面
 */

public class ApplicationAllActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    /*返回键*/
    private RelativeLayout back = null;
    /*管理键*/
    private RelativeLayout manage = null;
    /*完成键*/
    private RelativeLayout complete = null;
    /*分类*/
    private RelativeLayout rl_1, rl_2, rl_3, rl_4, rl_5, rl_6, rl_7, rl_8, rl_9;
    /*业务系统数据集合*/
    private ArrayList<Test> dataList = null;
    /*将传入的list根据类别拆分*/
    private ArrayList<Test> list_1 = new ArrayList<>();
    private ArrayList<Test> list_2 = new ArrayList<>();
    private ArrayList<Test> list_3 = new ArrayList<>();
    private ArrayList<Test> list_4 = new ArrayList<>();
    private ArrayList<Test> list_5 = new ArrayList<>();
    private ArrayList<Test> list_6 = new ArrayList<>();
    private ArrayList<Test> list_7 = new ArrayList<>();
    private ArrayList<Test> list_8 = new ArrayList<>();
    private ArrayList<Test> list_9 = new ArrayList<>();
    /*GridView*/
    private GridView gridView1 = null;
    private GridView gridView2 = null;
    private GridView gridView3 = null;
    private GridView gridView4 = null;
    private GridView gridView5 = null;
    private GridView gridView6 = null;
    private GridView gridView7 = null;
    private GridView gridView8 = null;
    private GridView gridView9 = null;
    /*适配器*/
    private NewGridViewAdapter mAdapter1, mAdapter2, mAdapter3, mAdapter4, mAdapter5, mAdapter6, mAdapter7,mAdapter8, mAdapter9;
    private NewGridViewAdapter mAdapter11, mAdapter22, mAdapter33, mAdapter44, mAdapter55, mAdapter66, mAdapter77,mAdapter88, mAdapter99;
    /*上下文*/
    private Context mContext;

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    manage.setVisibility(View.GONE);
                    complete.setVisibility(View.VISIBLE);
                    gridView1.setAdapter(mAdapter11);
                    gridView2.setAdapter(mAdapter22);
                    gridView3.setAdapter(mAdapter33);
                    gridView4.setAdapter(mAdapter44);
                    gridView5.setAdapter(mAdapter55);
                    gridView6.setAdapter(mAdapter66);
                    gridView7.setAdapter(mAdapter77);
                    gridView8.setAdapter(mAdapter88);
                    gridView9.setAdapter(mAdapter99);
                    mAdapter11.notifyDataSetChanged();
                    mAdapter22.notifyDataSetChanged();
                    mAdapter33.notifyDataSetChanged();
                    mAdapter44.notifyDataSetChanged();
                    mAdapter55.notifyDataSetChanged();
                    mAdapter66.notifyDataSetChanged();
                    mAdapter77.notifyDataSetChanged();
                    mAdapter88.notifyDataSetChanged();
                    mAdapter99.notifyDataSetChanged();
                    break;
                case 2:
                    complete.setVisibility(View.GONE);
                    manage.setVisibility(View.VISIBLE);
                    gridView1.setAdapter(mAdapter1);
                    gridView2.setAdapter(mAdapter2);
                    gridView3.setAdapter(mAdapter3);
                    gridView4.setAdapter(mAdapter4);
                    gridView5.setAdapter(mAdapter5);
                    gridView6.setAdapter(mAdapter6);
                    gridView7.setAdapter(mAdapter7);
                    gridView8.setAdapter(mAdapter8);
                    gridView9.setAdapter(mAdapter9);
                    mAdapter1.notifyDataSetChanged();
                    mAdapter2.notifyDataSetChanged();
                    mAdapter3.notifyDataSetChanged();
                    mAdapter4.notifyDataSetChanged();
                    mAdapter5.notifyDataSetChanged();
                    mAdapter6.notifyDataSetChanged();
                    mAdapter7.notifyDataSetChanged();
                    mAdapter8.notifyDataSetChanged();
                    mAdapter9.notifyDataSetChanged();
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_all);
        mContext = this;
        initView();
        initData();
    }

    /*假数据*/
    private void initData() {
        dataList = new ArrayList<>();
        Test test1 = new Test();
        test1.setType(1);
        test1.setCanModify(false);
        test1.setImgId(R.mipmap.application_baoxiao);
        test1.setTitle("1");
        dataList.add(test1);
        Test test2 = new Test();
        test2.setType(1);
        test2.setCanModify(false);
        test2.setImgId(R.mipmap.application_baoxiao);
        test2.setTitle("2");
        dataList.add(test2);
        Test test3 = new Test();
        test3.setType(1);
        test3.setCanModify(false);
        test3.setImgId(R.mipmap.application_baoxiao);
        test3.setTitle("3");
        dataList.add(test3);
        Test test4 = new Test();
        test4.setType(1);
        test4.setCanModify(false);
        test4.setImgId(R.mipmap.application_baoxiao);
        test4.setTitle("4");
        dataList.add(test4);
        Test test5 = new Test();
        test5.setType(1);
        test5.setCanModify(false);
        test5.setImgId(R.mipmap.application_baoxiao);
        test5.setTitle("5");
        dataList.add(test5);
        Test test6 = new Test();
        test6.setType(1);
        test6.setCanModify(false);
        test6.setImgId(R.mipmap.application_baoxiao);
        test6.setTitle("6");
        dataList.add(test6);
        Test test7 = new Test();
        test7.setType(1);
        test7.setCanModify(false);
        test7.setImgId(R.mipmap.application_baoxiao);
        test7.setTitle("7");
        dataList.add(test7);
        Test test8 = new Test();
        test8.setType(2);
        test8.setCanModify(true);
        test8.setImgId(R.mipmap.application_baoxiao);
        test8.setTitle("8");
        dataList.add(test8);
        Test test9 = new Test();
        test9.setType(2);
        test9.setCanModify(true);
        test9.setImgId(R.mipmap.application_baoxiao);
        test9.setTitle("9");
        dataList.add(test9);
        Test test10 = new Test();
        test10.setType(3);
        test10.setCanModify(true);
        test10.setImgId(R.mipmap.application_baoxiao);
        test10.setTitle("10");
        dataList.add(test10);
        Test test11 = new Test();
        test11.setType(3);
        test11.setCanModify(true);
        test11.setImgId(R.mipmap.application_baoxiao);
        test11.setTitle("11");
        dataList.add(test11);
        Test test12 = new Test();
        test12.setType(3);
        test12.setCanModify(true);
        test12.setImgId(R.mipmap.application_baoxiao);
        test12.setTitle("12");
        dataList.add(test12);
        Test test13 = new Test();
        test13.setType(3);
        test13.setCanModify(true);
        test13.setImgId(R.mipmap.application_baoxiao);
        test13.setTitle("13");
        dataList.add(test13);
        Test test14 = new Test();
        test14.setType(3);
        test14.setCanModify(true);
        test14.setImgId(R.mipmap.application_baoxiao);
        test14.setTitle("14");
        dataList.add(test14);
        Test test15 = new Test();
        test15.setType(4);
        test15.setCanModify(true);
        test15.setImgId(R.mipmap.application_baoxiao);
        test15.setTitle("15");
        dataList.add(test15);
        Test test16 = new Test();
        test16.setType(4);
        test16.setCanModify(true);
        test16.setImgId(R.mipmap.application_baoxiao);
        test16.setTitle("16");
        dataList.add(test16);
        Test test17 = new Test();
        test17.setType(4);
        test17.setCanModify(true);
        test17.setImgId(R.mipmap.application_baoxiao);
        test17.setTitle("17");
        dataList.add(test17);
        Test test18 = new Test();
        test18.setType(4);
        test18.setCanModify(true);
        test18.setImgId(R.mipmap.application_baoxiao);
        test18.setTitle("18");
        dataList.add(test18);
        Test test19 = new Test();
        test19.setType(4);
        test19.setCanModify(true);
        test19.setImgId(R.mipmap.application_baoxiao);
        test19.setTitle("19");
        dataList.add(test19);
        Test test20 = new Test();
        test20.setType(4);
        test20.setCanModify(true);
        test20.setImgId(R.mipmap.application_baoxiao);
        test20.setTitle("20");
        dataList.add(test20);
        Test test21 = new Test();
        test21.setType(4);
        test21.setCanModify(true);
        test21.setImgId(R.mipmap.application_baoxiao);
        test21.setTitle("21");
        dataList.add(test21);
        Test test22 = new Test();
        test22.setType(5);
        test22.setCanModify(true);
        test22.setImgId(R.mipmap.application_baoxiao);
        test22.setTitle("22");
        dataList.add(test22);
        Test test23 = new Test();
        test23.setType(5);
        test23.setCanModify(true);
        test23.setImgId(R.mipmap.application_baoxiao);
        test23.setTitle("23");
        dataList.add(test23);
        Test test24 = new Test();
        test24.setType(6);
        test24.setCanModify(true);
        test24.setImgId(R.mipmap.application_baoxiao);
        test24.setTitle("24");
        dataList.add(test24);
        Test test25 = new Test();
        test25.setType(7);
        test25.setCanModify(true);
        test25.setImgId(R.mipmap.application_baoxiao);
        test25.setTitle("25");
        dataList.add(test25);
        Test test26 = new Test();
        test26.setType(7);
        test26.setCanModify(true);
        test26.setImgId(R.mipmap.application_baoxiao);
        test26.setTitle("26");
        dataList.add(test26);
        Test test27 = new Test();
        test27.setType(7);
        test27.setCanModify(true);
        test27.setImgId(R.mipmap.application_baoxiao);
        test27.setTitle("27");
        dataList.add(test27);
        Test test28 = new Test();
        test28.setType(7);
        test28.setCanModify(true);
        test28.setImgId(R.mipmap.application_baoxiao);
        test28.setTitle("28");
        dataList.add(test28);
        Test test29 = new Test();
        test29.setType(7);
        test29.setCanModify(true);
        test29.setImgId(R.mipmap.application_baoxiao);
        test29.setTitle("29");
        dataList.add(test29);
        Test test30 = new Test();
        test30.setType(7);
        test30.setCanModify(true);
        test30.setImgId(R.mipmap.application_baoxiao);
        test30.setTitle("30");
        dataList.add(test30);
        Test test31 = new Test();
        test31.setType(8);
        test31.setCanModify(true);
        test31.setImgId(R.mipmap.application_baoxiao);
        test31.setTitle("31");
        dataList.add(test31);
        Test test32 = new Test();
        test32.setType(8);
        test32.setCanModify(true);
        test32.setImgId(R.mipmap.application_baoxiao);
        test32.setTitle("32");
        dataList.add(test32);
        Test test33 = new Test();
        test33.setType(9);
        test33.setCanModify(true);
        test33.setImgId(R.mipmap.application_baoxiao);
        test33.setTitle("33");
        dataList.add(test33);
        Test test34 = new Test();
        test34.setType(9);
        test34.setCanModify(true);
        test34.setImgId(R.mipmap.application_baoxiao);
        test34.setTitle("34");
        dataList.add(test34);


        for(int i = 0; i < dataList.size(); i++) {
            Test test = null;
            test = dataList.get(i);
            switch (test.getType()) {
                case 1:list_1.add(test);break;
                case 2:list_2.add(test);break;
                case 3:list_3.add(test);break;
                case 4:list_4.add(test);break;
                case 5:list_5.add(test);break;
                case 6:list_6.add(test);break;
                case 7:list_7.add(test);break;
                case 8:list_8.add(test);break;
                case 9:list_9.add(test);break;
            }
        }
        mAdapter1 = new NewGridViewAdapter(mContext, list_1, list_1, 1);
        mAdapter2 = new NewGridViewAdapter(mContext, list_2, list_1, 1);
        mAdapter3 = new NewGridViewAdapter(mContext, list_3, list_1, 1);
        mAdapter4 = new NewGridViewAdapter(mContext, list_4, list_1, 1);
        mAdapter5 = new NewGridViewAdapter(mContext, list_5, list_1, 1);
        mAdapter6 = new NewGridViewAdapter(mContext, list_6, list_1, 1);
        mAdapter7 = new NewGridViewAdapter(mContext, list_7, list_1, 1);
        mAdapter8 = new NewGridViewAdapter(mContext, list_8, list_1, 1);
        mAdapter9 = new NewGridViewAdapter(mContext, list_9, list_1, 1);
        gridView1.setAdapter(mAdapter1);
        gridView2.setAdapter(mAdapter2);
        gridView3.setAdapter(mAdapter3);
        gridView4.setAdapter(mAdapter4);
        gridView5.setAdapter(mAdapter5);
        gridView6.setAdapter(mAdapter6);
        gridView7.setAdapter(mAdapter7);
        gridView8.setAdapter(mAdapter8);
        gridView9.setAdapter(mAdapter9);
        gridView1.setOnItemClickListener(this);
        gridView2.setOnItemClickListener(this);
        gridView3.setOnItemClickListener(this);
        gridView4.setOnItemClickListener(this);
        gridView5.setOnItemClickListener(this);
        gridView6.setOnItemClickListener(this);
        gridView7.setOnItemClickListener(this);
        gridView8.setOnItemClickListener(this);
        gridView9.setOnItemClickListener(this);
        mAdapter11 = new NewGridViewAdapter(mContext, list_1, list_1, 2);
        mAdapter22 = new NewGridViewAdapter(mContext, list_2, list_1, 2);
        mAdapter33 = new NewGridViewAdapter(mContext, list_3, list_1, 2);
        mAdapter44 = new NewGridViewAdapter(mContext, list_4, list_1, 2);
        mAdapter55 = new NewGridViewAdapter(mContext, list_5, list_1, 2);
        mAdapter66 = new NewGridViewAdapter(mContext, list_6, list_1, 2);
        mAdapter77 = new NewGridViewAdapter(mContext, list_7, list_1, 2);
        mAdapter88 = new NewGridViewAdapter(mContext, list_8, list_1, 2);
        mAdapter99 = new NewGridViewAdapter(mContext, list_9, list_1, 2);
    }

    private void initView() {
        back = (RelativeLayout) findViewById(R.id.application_back);
        back.setOnClickListener(this);
        manage = (RelativeLayout) findViewById(R.id.application_manage);
        manage.setOnClickListener(this);
        complete = (RelativeLayout) findViewById(R.id.application_complete);
        complete.setOnClickListener(this);
        gridView1 = (GridView) findViewById(R.id.application_gridview_1);
        gridView2 = (GridView) findViewById(R.id.application_gridview_2);
        gridView3 = (GridView) findViewById(R.id.application_gridview_3);
        gridView4 = (GridView) findViewById(R.id.application_gridview_4);
        gridView5 = (GridView) findViewById(R.id.application_gridview_5);
        gridView6 = (GridView) findViewById(R.id.application_gridview_6);
        gridView7 = (GridView) findViewById(R.id.application_gridview_7);
        gridView8 = (GridView) findViewById(R.id.application_gridview_8);
        gridView9 = (GridView) findViewById(R.id.application_gridview_9);
        rl_1 = (RelativeLayout) findViewById(R.id.application_rl_1);
        rl_2 = (RelativeLayout) findViewById(R.id.application_rl_2);
        rl_3 = (RelativeLayout) findViewById(R.id.application_rl_3);
        rl_4 = (RelativeLayout) findViewById(R.id.application_rl_4);
        rl_5 = (RelativeLayout) findViewById(R.id.application_rl_5);
        rl_6 = (RelativeLayout) findViewById(R.id.application_rl_6);
        rl_7 = (RelativeLayout) findViewById(R.id.application_rl_7);
        rl_8 = (RelativeLayout) findViewById(R.id.application_rl_8);
        rl_9 = (RelativeLayout) findViewById(R.id.application_rl_9);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.application_back:
                ApplicationAllActivity.this.finish();
                break;
            case R.id.application_manage:
                Toast.makeText(mContext, "sadjhaksd", Toast.LENGTH_SHORT).show();
                mHandler.sendMessage(Message.obtain(mHandler, 1, null));
                break;
            case R.id.application_complete:
                mHandler.sendMessage(Message.obtain(mHandler, 2, null));
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        boolean b = false;
        switch (parent.getId()) {
            case R.id.application_gridview_1:
                if (list_1.get(position).getCanModify()) {
                    list_1.remove(position);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter22.notifyDataSetChanged();
                mAdapter33.notifyDataSetChanged();
                mAdapter44.notifyDataSetChanged();
                mAdapter55.notifyDataSetChanged();
                mAdapter66.notifyDataSetChanged();
                mAdapter77.notifyDataSetChanged();
                mAdapter88.notifyDataSetChanged();
                mAdapter99.notifyDataSetChanged();
                break;
            case R.id.application_gridview_2:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_2.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_2.get(position).getCanModify());
                    test.setImgId(list_2.get(position).getImgId());
                    test.setTitle(list_2.get(position).getTitle());
                    test.setType(list_2.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter22.notifyDataSetChanged();
                break;
            case R.id.application_gridview_3:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_3.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_3.get(position).getCanModify());
                    test.setImgId(list_3.get(position).getImgId());
                    test.setTitle(list_3.get(position).getTitle());
                    test.setType(list_3.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter33.notifyDataSetChanged();
                break;
            case R.id.application_gridview_4:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_4.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_4.get(position).getCanModify());
                    test.setImgId(list_4.get(position).getImgId());
                    test.setTitle(list_4.get(position).getTitle());
                    test.setType(1);
                    test.setType(list_4.get(position).getType());
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter44.notifyDataSetChanged();
                break;
            case R.id.application_gridview_5:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_5.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_5.get(position).getCanModify());
                    test.setImgId(list_5.get(position).getImgId());
                    test.setTitle(list_5.get(position).getTitle());
                    test.setType(list_5.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter55.notifyDataSetChanged();
                break;
            case R.id.application_gridview_6:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_6.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_6.get(position).getCanModify());
                    test.setImgId(list_6.get(position).getImgId());
                    test.setTitle(list_6.get(position).getTitle());
                    test.setType(list_6.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter66.notifyDataSetChanged();
                break;
            case R.id.application_gridview_7:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_7.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_7.get(position).getCanModify());
                    test.setImgId(list_7.get(position).getImgId());
                    test.setTitle(list_7.get(position).getTitle());
                    test.setType(list_7.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter77.notifyDataSetChanged();
                break;
            case R.id.application_gridview_8:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_8.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_8.get(position).getCanModify());
                    test.setImgId(list_8.get(position).getImgId());
                    test.setTitle(list_8.get(position).getTitle());
                    test.setType(list_8.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter88.notifyDataSetChanged();
                break;
            case R.id.application_gridview_9:
                for (int i = 0;i < list_1.size();i++){
                    if (list_1.get(i).getTitle().equals(list_9.get(position).getTitle())) {
                        b = true;
                    }
                }
                if (!b) {
                    Test test = new Test();
                    test.setCanModify(list_9.get(position).getCanModify());
                    test.setImgId(list_9.get(position).getImgId());
                    test.setTitle(list_9.get(position).getTitle());
                    test.setType(list_9.get(position).getType());
                    test.setType(1);
                    list_1.add(test);
                }
                mAdapter11.notifyDataSetChanged();
                mAdapter99.notifyDataSetChanged();
                break;
        }
    }
}

