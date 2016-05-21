package com.example.tchl.mvpscreendensity.model.impl;

import com.example.tchl.mvpscreendensity.ThirdLib.ScreenDensityRequest;
import com.example.tchl.mvpscreendensity.model.ScreenDensityModel;
import com.example.tchl.mvpscreendensity.presenter.OnScreenDensityListener;


//import com.android.volley.Response;
/*import com.android.volley.VolleyError;
import com.google.gson.Gson;*/
/*import com.example.tchl.mvpscreendensity.volley.*;*/

/**
 * Created by tchl on 2016-05-15.
 */
public class ScreenDensityModelImpl implements ScreenDensityModel {
 /*   @Override
    public void loadScreenDensity(final OnScreenDensityListener listener){
        ;
    }*/

    public void loadScreenDensity( final OnScreenDensityListener listener) {
        ScreenDensityRequest.newInstance(listener).RequestSceenDensity();

    }

/*    @Override
    public void loadScreenDensity( final OnScreenDensityListener listener) {
        ScreenDensityRequest.newInstance().newScreenDennsityRequest(ScreenDensity.class,
                new Response.Listener<ScreenDensity>(){
                    @Override
                    public void onResponse(ScreenDensity screenDensity){
                        if(screenDensity!=null){
                            listener.onSuccess();
                        }else{
                            listener.onError();
                        }
                    }
                },new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(){
                        listener.onError();
                    }
                });*/


/*        *//*数据层操作*//*
        VolleyRequest.newInstance().newGsonRequest("http://www.weather.com.cn/data/sk/0574" + ".html",
                ScreenDensity.class, new Response.Listener<ScreenDensity>() {
                    @Override
                    public void onResponse(ScreenDensity screenDensity) {
                        if (screenDensity != null) {
                            listener.onSuccess(screenDensity);
                        } else {
                            listener.onError();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        listener.onError();
                    }
                });*/
    //}
}
