package com.rx.webApplication.entities;

import java.sql.Timestamp;

/**
 * Created by 王玉粮 on 2017/7/16.
 */
public class TlkAccesstokenEntity {
    private String item_access_token;
    private String item_expires_in;
    private String id;
    private Timestamp item_update_time;

    public Timestamp getItem_update_time() {
        return item_update_time;
    }

    public void setItem_update_time(Timestamp item_update_time) {
        this.item_update_time = item_update_time;
    }

    public String getItem_access_token() {
        return item_access_token;
    }

    public void setItem_access_token(String item_access_token) {
        this.item_access_token = item_access_token;
    }

    public String getItem_expires_in() {
        return item_expires_in;
    }

    public void setItem_expires_in(String item_expires_in) {
        this.item_expires_in = item_expires_in;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
