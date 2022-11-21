package com.system;

public class API3 {
    private String funeral_name;
    private String funeral_address;
    private int funeral_price;
    private String funeral_way;
    public API3(String funeral_name, String funeral_address, int funeral_price, String funeral_way){
        this.funeral_name = funeral_name;
        this.funeral_address = funeral_address;
        this.funeral_price = funeral_price;
        this.funeral_way = funeral_way;
    }
    public String getAllData(){
        return funeral_name+"\n"+funeral_address+"\n"+funeral_price+"\n"+funeral_way+"\n";
    }
    public String toString(){
        return "funeral_name: "+funeral_name+
                "\tfuneral_address: "+funeral_address+
                "\tfuneral_price: "+funeral_price+
                "\tfuneral_way: "+funeral_way+"\n";
    }
}
