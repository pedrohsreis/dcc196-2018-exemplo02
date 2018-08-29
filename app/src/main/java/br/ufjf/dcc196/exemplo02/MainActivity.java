package br.ufjf.dcc196.exemplo02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String PESSOA_NOME = "nome";
    private Button btnProfessor;
    private EditText edtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProfessor = findViewById(R.id.btn_professor);
        edtNome = findViewById(R.id.edt_nome);

        btnProfessor.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfessorActivity.class);
                intent.putExtra(PESSOA_NOME, edtNome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
