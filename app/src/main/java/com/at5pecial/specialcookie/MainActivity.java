package com.at5pecial.specialcookie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button = findViewById(R.id.Cookie);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventDialogFragment e = EventDialogFragment.getInstance();
                e.show(getSupportFragmentManager(), EventDialogFragment.TAG_EVENT_DIALOG);
            }
        });



    }


}
