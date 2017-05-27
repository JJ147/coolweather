package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mom on 2017/5/27.
 */

public class Provine extends DataSupport {
    private int id;
    private String provinceName;
    private  int provinceCode;


    private int grtId(){
        return id;

    }
    public void setId(int id){
        this.id=id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
