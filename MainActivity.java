package com.example.aluno.radioquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lbPergunta1;
    TextView lbPergunta2;
    TextView lbPergunta3;
    TextView lbPergunta4;
    TextView lbPergunta5;

    RadioButton rbResposta11;
    RadioButton rbResposta12;
    RadioButton rbResposta21;
    RadioButton rbResposta22;
    RadioButton rbResposta31;
    RadioButton rbResposta32;
    RadioButton rbResposta41;
    RadioButton rbResposta42;
    RadioButton rbResposta51;
    RadioButton rbResposta52;

    Button btnResponder;

    public int pontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lbPergunta1 = (TextView)findViewById(R.id.lbPergunta1);
        lbPergunta2 = (TextView)findViewById(R.id.lbPergunta2);
        lbPergunta3 = (TextView)findViewById(R.id.lbPergunta3);
        lbPergunta4 = (TextView)findViewById(R.id.lbPergunta4);
        lbPergunta5 = (TextView)findViewById(R.id.lbPergunta5);

        rbResposta11 = (RadioButton)findViewById(R.id.rbResposta11);
        rbResposta12 = (RadioButton)findViewById(R.id.rbResposta12);
        rbResposta21 = (RadioButton)findViewById(R.id.rbResposta21);
        rbResposta22 = (RadioButton)findViewById(R.id.rbResposta22);
        rbResposta31 = (RadioButton)findViewById(R.id.rbResposta31);
        rbResposta32 = (RadioButton)findViewById(R.id.rbResposta32);
        rbResposta41 = (RadioButton)findViewById(R.id.rbResposta41);
        rbResposta42 = (RadioButton)findViewById(R.id.rbResposta42);
        rbResposta51 = (RadioButton)findViewById(R.id.rbResposta51);
        rbResposta52 = (RadioButton)findViewById(R.id.rbResposta52);

        btnResponder = (Button)findViewById(R.id.btnResponder);

    }


    public void Resposta(View view){
        rbResposta11.setTextColor(Color.GREEN);
        rbResposta12.setTextColor(Color.RED);
        rbResposta21.setTextColor(Color.RED);
        rbResposta22.setTextColor(Color.GREEN);
        rbResposta31.setTextColor(Color.RED);
        rbResposta32.setTextColor(Color.GREEN);
        rbResposta41.setTextColor(Color.RED);
        rbResposta42.setTextColor(Color.GREEN);
        rbResposta51.setTextColor(Color.GREEN);
        rbResposta52.setTextColor(Color.RED);

        if(rbResposta11.isChecked()){
            pontos++;
        }
        if(rbResposta22.isChecked()){
            pontos++;
        }
        if(rbResposta32.isChecked()){
            pontos++;
        }
        if(rbResposta42.isChecked()){
            pontos++;
        }
        if(rbResposta51.isChecked()){
            pontos++;
        }

        Toast toast = Toast.makeText(getApplicationContext(), "Você acertou " + pontos + " perguntas!", Toast.LENGTH_LONG);
        toast.show();
        pontos = 0;
    }
}
