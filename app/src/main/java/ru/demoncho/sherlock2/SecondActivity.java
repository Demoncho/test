package ru.demoncho.sherlock2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends Activity {
    public final static String THIEF = "Пустота";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onRadioClick(View view) {
        Intent answerIntent = new Intent();
        switch (view.getId()){
            case R.id.radioDog: answerIntent.putExtra(THIEF,"Сраный песик"); break;
            case R.id.radioCat: answerIntent.putExtra(THIEF,"Кот Васька"); break;
            case R.id.radioCrow: answerIntent.putExtra(THIEF,"Ворона"); break;
            default: break;
        }
        setResult(RESULT_OK,answerIntent);
        finish();
    }
}
