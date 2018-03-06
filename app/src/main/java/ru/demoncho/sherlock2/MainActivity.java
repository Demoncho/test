package ru.demoncho.sherlock2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    static final private int CHOOSE_THIEF = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void onClick(View view) {
        Intent questionIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivityForResult(questionIntent,CHOOSE_THIEF);
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        TextView infoTextView = findViewById(R.id.textViewInfo);
        if (requestCode == CHOOSE_THIEF){
            if (resultCode == RESULT_OK){
                String thiefname = data.getStringExtra(SecondActivity.THIEF);
                infoTextView.setText(thiefname);
            }
            else infoTextView.setText("");
        }
    }
}
