package com.example.a20200320_01_profile;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents(); //이벤트 세팅
    public abstract void setValues(); // 값 세팅

}
