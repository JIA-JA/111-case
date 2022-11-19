package com.system;

public class Example {
    private String user_id;
    private String user_name;
    private String tag_;
    private String content;
    private int like_num;
    private String message;
    private String user_msgreply;
    public Example(String ui, String un, String t, String c, int l, String m, String um){
        this.user_id = ui;
        this.user_name = un;
        this.tag_ = t;
        this.content = c;
        this.like_num = l;
        this.message = m;
        this.user_msgreply = um;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContent(){return content;}

    public String toString(){
        return "user_id:"+user_id+"\tuser_name:"+user_name+"\ttag_:"+tag_+"\tcontent:"+content
                +"\tlike_num:"+like_num+"\tmessage:"+message+"\tuser_msgreply:"+user_msgreply;
    }
}
