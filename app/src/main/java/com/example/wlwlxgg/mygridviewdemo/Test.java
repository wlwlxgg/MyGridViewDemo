package com.example.wlwlxgg.mygridviewdemo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by wlwlxgg on 2016/12/15.
 * 应用首页改版，全部界面假数据对象
 */

public class Test implements Serializable {
    private int type;
    private int imgId;
    private String title;
    private Boolean canModify;

    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
