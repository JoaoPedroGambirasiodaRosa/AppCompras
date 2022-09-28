package com.example.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox arroz, leite, carne, feijao;
    Button bttotal;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arroz = (CheckBox) findViewById(R.id.cbArroz);
        leite = (CheckBox) findViewById(R.id.cbLeite);
        carne = (CheckBox) findViewById(R.id.cbCarne);
        feijao = (CheckBox) findViewById(R.id.cbFeijao);
        bttotal = (Button) findViewById(R.id.btCalc);
        bttotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                if (arroz.isChecked()) {
                    total += 2.69;
                }
                if (leite.isChecked()) {
                    total += 5.00;
                }
                if (carne.isChecked()) {
                    total += 9.7;
                }
                if (feijao.isChecked()) {
                    total += 2.70;
                }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Total de Compras" + String.valueOf(total));
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            } });
    }
}
