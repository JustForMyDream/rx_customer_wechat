package com.rx.webApplication.entities;

import java.sql.Timestamp;

/**
 * Created by 王玉粮 on 2017/6/23.
 */
public class TlkLocationDataEntity {
    private String id;
    private String itemOpenid;
    private Timestamp dateTime;
    private String itemType;
    private String itemLatitude;
    private String itemLongitude;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemOpenid() {
        return itemOpenid;
    }

    public void setItemOpenid(String itemOpenid) {
        this.itemOpenid = itemOpenid;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemLatitude() {
        return itemLatitude;
    }

    public void setItemLatitude(String itemLatitude) {
        this.itemLatitude = itemLatitude;
    }

    public String getItemLongitude() {
        return itemLongitude;
    }

    public void setItemLongitude(String itemLongitude) {
        this.itemLongitude = itemLongitude;
    }
}
