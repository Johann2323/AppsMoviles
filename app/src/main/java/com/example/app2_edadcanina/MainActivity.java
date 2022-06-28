package com.example.app2_edadcanina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app2_edadcanina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText txt_edad = binding.txtEdad;
        TextView txt_resultado = binding.txtResultado;
        Button btn_calcular = binding.btnCalcular;



        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String edad = txt_edad.getText().toString();
               if (!edad.isEmpty()){
                   int resultado = Integer.parseInt(edad) * 7;
                   String msg_resultado= "La edad de tu perrito es: " + resultado;
                   txt_resultado.setText(msg_resultado);
               }else{
                   Context context = MainActivity.this;
                   CharSequence text = "Debe ingresar un numero";
                   int duration = Toast.LENGTH_SHORT;

                   Toast toast = Toast.makeText(context, text, duration);
                   toast.show();
               }

            }
        });


    }
}