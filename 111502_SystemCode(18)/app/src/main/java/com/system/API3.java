package com.system;

public class API3 {
    private String funeral_name;
    private String funeral_address;
    private String funeral_phonenum;
    private int funeral_price;
    private String funeral_way;
    public API3(String funeral_name, String funeral_address,String funeral_phonenum, int funeral_price, String funeral_way){
        this.funeral_name = funeral_name;
        this.funeral_address = funeral_address;
        this.funeral_phonenum = funeral_phonenum;
        this.funeral_price = funeral_price;
        this.funeral_way = funeral_way;
    }
    public String getAllData(){
        return "店家: "+funeral_name+"\n地址: "+funeral_address+"\n電話: "+funeral_phonenum+"\n價格: "+funeral_price+"\n處理方式: "+funeral_way+"\n";
    }
    public String toString(){
        return "funeral_name: "+funeral_name+
                "\tfuneral_address: "+funeral_address+
                "\tfuneral_phonenum: "+funeral_phonenum+
                "\tfuneral_price: "+funeral_price+
                "\tfuneral_way: "+funeral_way+"\n";
    }
}
