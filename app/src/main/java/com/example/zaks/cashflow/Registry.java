package com.example.zaks.cashflow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registry extends AppCompatActivity {

    EditText editTextUserNameR;
    EditText editTextFirstNameR;
    EditText editTextStreetR;
    EditText editTextCityR;
    EditText editTextLastNameR;
    EditText editTextEmailR;
    EditText editTextPassword2R;
    EditText editTextPasswordR;
    Button btnEnterRegistrationR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);

        editTextUserNameR = (EditText)findViewById(R.id.editTextUserNameR);
         editTextFirstNameR = (EditText)findViewById(R.id.editTextFirstNameR);;
         editTextStreetR= (EditText)findViewById(R.id.editTextStreetR);;
         editTextCityR= (EditText)findViewById(R.id.editTextCityR);;
         editTextLastNameR= (EditText)findViewById(R.id.editTextLastNameR);;
         editTextEmailR= (EditText)findViewById(R.id.editTextEmailR);;
         editTextPassword2R= (EditText)findViewById(R.id.editTextPassword2R);;
         editTextPasswordR= (EditText)findViewById(R.id.editTextPasswordR);;
         btnEnterRegistrationR= (Button) findViewById(R.id.buttonEnterRegistration);
/*
        editTextUserNameR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextUserNameR.setText("");
                    }
                });


        editTextFirstNameR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextFirstNameR.setText("");
                    }
                });
        editTextStreetR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextStreetR.setText("");
                    }
                });
        editTextCityR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextCityR.setText("");
                    }
                });
        editTextLastNameR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextLastNameR.setText("");
                    }
                });
        editTextEmailR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextEmailR.setText("");
                    }
                });
        editTextPassword2R.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextPassword2R.setText("");
                    }
                });
        editTextPasswordR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        editTextPasswordR.setText("");
                    }
                });*/


        btnEnterRegistrationR.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String userName = editTextUserNameR.getText().toString();
                        String password2 = editTextPassword2R.getText().toString();
                        String password = editTextPasswordR.getText().toString();
                        String firstName = editTextFirstNameR.getText().toString();
                        String lastName = editTextLastNameR.getText().toString();
                        String street = editTextStreetR.getText().toString();
                        String city = editTextCityR.getText().toString();
                        String email = editTextEmailR.getText().toString();

                        if(!(userName.length() < 1)
                            || !(password2.length() < 1)
                            || !(password.length() < 1)
                            || !(firstName.length() < 1)
                            || !(lastName.length() < 1)
                            || !(street.length() < 1)
                            || !(city.length() < 1)
                            || !(email.length() < 1)) {
                            if(password == password2) {
                                Intent intent = new Intent(Registry.this, MainActivity.class);
                                intent.putExtra("userName", editTextUserNameR.getText().toString());
                                intent.putExtra("password", editTextPasswordR.getText().toString());
                                intent.putExtra("firstName", editTextFirstNameR.getText().toString());
                                intent.putExtra("lastName", editTextLastNameR.getText().toString());
                                intent.putExtra("street", editTextStreetR.getText().toString());
                                intent.putExtra("city", editTextCityR.getText().toString());
                                intent.putExtra("email", editTextEmailR.getText().toString());

                                startActivity(intent);
                            }
                        }

                    }
                });

    }
}
