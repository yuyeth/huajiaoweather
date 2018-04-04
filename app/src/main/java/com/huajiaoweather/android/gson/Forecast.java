package com.huajiaoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YuYang on 2018/4/3 0003.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;

        public String min;

    }

    public class More {

        @SerializedName("tex_d")
        public String info;
    }
}