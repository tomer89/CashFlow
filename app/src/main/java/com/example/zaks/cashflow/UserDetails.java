package com.example.zaks.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserDetails extends AppCompatActivity {

    TextView name;
    TextView userName;
    TextView address;
    TextView email;
    Button backBtn;

    //TODO a back btn

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        name = (TextView)findViewById(R.id.textViewNameP);
        userName = (TextView)findViewById(R.id.textViewUserNameP);
        address = (TextView)findViewById(R.id.textViewAddP);
        email = (TextView)findViewById(R.id.textViewEmailP);
        backBtn = (Button)findViewById(R.id.btnBackProfile);

        //TODO if null btn
        name.setText(getIntent().getExtras().getString("firstName") + " " + getIntent().getExtras().getString("lastName"));
        userName.setText(getIntent().getExtras().getString("userName"));
        address.setText(getIntent().getExtras().getString("street") + ", " + getIntent().getExtras().getString("city"));
        email.setText(getIntent().getExtras().getString("email"));

        backBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(UserDetails.this, MainActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
