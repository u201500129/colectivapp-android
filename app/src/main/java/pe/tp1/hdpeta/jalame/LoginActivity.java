package pe.tp1.hdpeta.jalame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button ingresarButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        ingresarButton = (Button) findViewById(R.id.ingresarButton);

        ingresarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateInput();
            }
        });

    }

    private void validateInput() {
        if (emailEditText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Inserse su email", Toast.LENGTH_SHORT).show();
            return;
        }
        if (passwordEditText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Inserse su password", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Usuario logeado correctamente", Toast.LENGTH_SHORT).show();
    }
}