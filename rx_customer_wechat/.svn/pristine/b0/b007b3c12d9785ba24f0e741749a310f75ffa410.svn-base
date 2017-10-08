package com.cxt.wechat.message;

import java.util.List;

/**
 * Created by cccxt on 2016/8/24.
 */
public class News {
    private String ToUserName;
    private String FromUserName;
    private int CreateTime;
    private String MsgType;
    private int ArticleCount;
    private List<ArticlesItem> Articles;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<ArticlesItem> getArticles() {
        return Articles;
    }

    public void setArticles(List<ArticlesItem> articles) {
        Articles = articles;
        ArticleCount = articles.size();
    }
}
