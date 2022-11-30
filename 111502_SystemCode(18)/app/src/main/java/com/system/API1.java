package com.system;

public class API1 {
    private String user_id;
    private String user_name;
    private String tag_;
    private String content;
    private int like_num;
    private String message;
    private String user_msgreply;
    public API1(String user_id, String user_name, String tag_, String content, int like_num, String message, String user_msgreply){
        this.user_id = user_id;
        this.user_name = user_name;
        this.tag_ = tag_;
        this.content = content;
        this.like_num = like_num;
        this.message = message;
        this.user_msgreply = user_msgreply;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getTag_() {
        return tag_;
    }

    public String getContent(){return content;}

    public int getLike_num() {
        return like_num;
    }

    public String toString(){
        return "user_id:"+user_id+"\tuser_name:"+user_name+"\ttag_:"+tag_+"\tcontent:"+content
                +"\tlike_num:"+like_num+"\tmessage:"+message+"\tuser_msgreply:"+user_msgreply;
    }
}
