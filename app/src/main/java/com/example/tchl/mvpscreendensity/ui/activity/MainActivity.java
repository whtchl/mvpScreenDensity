package com.example.tchl.mvpscreendensity.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tchl.mvpscreendensity.R;
import com.example.tchl.mvpscreendensity.presenter.ScreenDensityPresenter;
import com.example.tchl.mvpscreendensity.presenter.impl.ScreenDensityPresenterImpl;
import com.example.tchl.mvpscreendensity.ui.common.BaseActivity;
import com.example.tchl.mvpscreendensity.ui.view.ScreenDensityView;

public class MainActivity extends BaseActivity implements ScreenDensityView, View.OnClickListener{

    private ScreenDensityPresenter screenDensityPresenter;
    private TextView pmkg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        findView(R.id.btn_getScreenDensity).setOnClickListener(this);
        pmkg =findView(R.id.pmkg);
        screenDensityPresenter = new ScreenDensityPresenterImpl(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_getScreenDensity:
                screenDensityPresenter.getScreenDensity();
                break;
        }
    }


    @Override
    public void showError(){
        Toast.makeText(this,"showError",Toast.LENGTH_LONG);
    }

    @Override
    public void showLoading(){
        Log.d("tchl","tchl showlodading");
        Toast.makeText(this,"showLoading",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setScreenDensityInfo(){
        Toast.makeText(this,"setScreenDensity0",Toast.LENGTH_LONG).show();
        pmkg.setText(  String.valueOf( getWindowManager().getDefaultDisplay().getWidth())+" * "+ String.valueOf(getWindowManager().getDefaultDisplay().getHeight()));

    }
}
