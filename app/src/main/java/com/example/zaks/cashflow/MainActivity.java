package com.example.zaks.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton profile;
    ImageButton googleMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO google maps
        profile = (ImageButton)findViewById(R.id.profile);
        googleMaps = (ImageButton)findViewById(R.id.imageButtonMapMain);

        profile.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, UserDetails.class);
                        //TODO make that password confirmation is equal
                        intent.putExtra("userName", getIntent().getExtras().getString("userName"));
                        intent.putExtra("firstName", getIntent().getExtras().getString("firstName"));
                        intent.putExtra("lastName", getIntent().getExtras().getString("lastName"));
                        intent.putExtra("street", getIntent().getExtras().getString("street"));
                        intent.putExtra("city", getIntent().getExtras().getString("city"));
                        intent.putExtra("email", getIntent().getExtras().getString("email"));

                        startActivity(intent);
                    }
                }
        );

        googleMaps.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                        startActivity(intent);
                    }

                }
        );

    }
}
