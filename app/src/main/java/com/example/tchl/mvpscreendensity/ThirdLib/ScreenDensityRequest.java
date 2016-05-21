package com.example.tchl.mvpscreendensity.ThirdLib;

import com.example.tchl.mvpscreendensity.presenter.OnScreenDensityListener;


/**
 * Created by tchl on 2016-05-18.
 */
public class ScreenDensityRequest  {
     private OnScreenDensityListener callback;
/*    private  Listener mListener;
    private Class mClass;*/
/*    private ScreenDensity  screenDensity;*/
    private ScreenDensityRequest(OnScreenDensityListener callback) {
        this.callback = callback;
    }

    public static ScreenDensityRequest newInstance(OnScreenDensityListener callback) {
        return new ScreenDensityRequest(callback);
    }
    public void RequestSceenDensity(){ //在这里获取数据
        callback.onSuccess();

    }

}
