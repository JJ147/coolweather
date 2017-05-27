package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mom on 2017/5/27.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provincId;

    public int getProvincId() {
        return provincId;
    }

    public void setProvincId(int provincId) {
        this.provincId = provincId;
    }

    public int getCityCode() {

        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {

        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


