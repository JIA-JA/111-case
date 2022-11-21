package com.system;

public class API2 {
    private String symptom_ID;
    private String sympton_name;
    private String symptom_describe;
    public API2(String symptom_ID, String sympton_name, String symptom_describe){
        this.symptom_ID = symptom_ID;
        this.sympton_name = sympton_name;
        this.symptom_describe = symptom_describe;
    }

    public String getSympton_name(){
        return sympton_name;
    }

    public String getSymptom_describe(){
        return symptom_describe;
    }

    public String toString(){
        return "symptom_ID: "+symptom_ID+
                "\tsympton_name: "+sympton_name+
                "\tsymptom_describe: "+symptom_describe+"\n";
    }
}
