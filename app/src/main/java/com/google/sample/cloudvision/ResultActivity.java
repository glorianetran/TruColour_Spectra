package com.google.sample.cloudvision;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ResultActivity extends AppCompatActivity {

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(v -> {
            String url = "https://www.fentybeauty.com/pro-filtr/soft-matte-longwear-foundation/FB30006.html?bvstate=pg:42/ct:r";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

    }
}
