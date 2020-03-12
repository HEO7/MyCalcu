package com.heo.mycalcu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   double sayi1,sayi2;
   double sonuc;
   String islem="";

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final Button temizle = findViewById(R.id.btntemizle);
        final Button esit = findViewById(R.id.btnesit);
        final  Button carp = findViewById(R.id.btncarp);
        final Button cikar = findViewById(R.id.btncikar);
        final Button topla = findViewById(R.id.btntopla);
        final  Button bol = findViewById(R.id.btnbol);
        final Button yuzde = findViewById(R.id.btnyuzde);
        final EditText gecmis = findViewById(R.id.txtgecmis);
        final  TextView giris = (TextView) findViewById(R.id.giris);

            topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi1= Double.parseDouble(giris.getText().toString());
                    islem="+";
                    giris.setText("");


                }
            });

            cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi1= Double.parseDouble(giris.getText().toString());
                    islem="-";
                    giris.setText("");

                }
            });


            carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi1= Double.parseDouble(giris.getText().toString());
                    islem="x";
                    giris.setText("");

                }
            });

            bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi1=Double.parseDouble(giris.getText().toString());
                    islem="/";
                    giris.setText("");
                }
            });

            yuzde.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi1=Double.parseDouble(giris.getText().toString());
                    islem="%";
                    giris.setText("");
                }
            });

            esit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sayi2=Integer.parseInt(giris.getText().toString());
                    switch (islem){
                        case "+":
                            sonuc=sayi1+sayi2;

                            break;
                        case "-":
                            sonuc=sayi1-sayi2;

                            break;
                        case "x":
                            sonuc=sayi1*sayi2;

                            break;
                        case "/":
                            sonuc=sayi1/sayi2;

                            break;
                        case "%":
                            sonuc= sayi1/100*sayi2;

                    }

                    giris.setText(""+sonuc);
                    gecmis.setText(sayi1+" "+islem+" "+sayi2+" = "+sonuc+"\n"+gecmis.getText().toString());



                }
            });
            temizle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gecmis.setText("");
                    giris.setText("");

                }
            });

    }
}
