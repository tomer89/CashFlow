package com.example.zaks.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button btnLogin;
    Button btnRegistry;
    EditText editTextUserName;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnRegistry = (Button)findViewById(R.id.btnRegistry);

        editTextUserName   = (EditText)findViewById(R.id.textEditUserName);
        editTextPassword   = (EditText)findViewById(R.id.textEditPassword);


        btnLogin.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String userName = editTextUserName.getText().toString();
                        String password = editTextPassword.getText().toString();

                        if(!(userName.length() < 1) || !(password.length() < 1)) {

                            Intent intent = new Intent(Login.this, MainActivity.class);

                            intent.putExtra("userName", userName);
                            intent.putExtra("password", password);

                            startActivity(intent);
                        }


                    }
                });



        btnRegistry.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent intent = new Intent(Login.this, Registry.class);

                        startActivity(intent);

                    }
                });



    }
}
