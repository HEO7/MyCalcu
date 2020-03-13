package com.heo.mycalcu;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
        final Button kapat = findViewById(R.id.btnclose);
        final Button zero = findViewById(R.id.btn0);
        final Button one = findViewById(R.id.btn1);
        final Button two = findViewById(R.id.btn2);
        final Button tree = findViewById(R.id.btn3);
        final Button four = findViewById(R.id.btn4);
        final Button five = findViewById(R.id.btn5);
        final Button six = findViewById(R.id.btn6);
        final Button seven = findViewById(R.id.btn7);
        final Button eight = findViewById(R.id.btn8);
        final Button nine = findViewById(R.id.btn9);
        final Button geri = findViewById(R.id.btngeri);


        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (!(giris.getText().toString().equals("")))
               {

                   String sil = giris.getText().toString();
                   sil = sil.substring(0,sil.length()-1);
                   giris.setText(sil);
               }
               else {
                   islem="";
               }
            }
        });

        geri.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                giris.setText("");
                return true;
            }
        });


        kapat.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                finish();
                System.exit(0);

                return true;
            }
        });


            zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"0");
                }
            });

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"1");
                }
            });

            two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"2");
                     }
            });

            tree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"3");
                }
            });

            four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"4");
                }
            });

            five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"5");
                }
            });

            six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"6");
                }
            });
            seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"7");
                }
            });

            eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"8");
                }
            });

            nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    giris.setText(giris.getText().toString()+"9");
                }
            });


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

            kapat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(giris.getWindowToken(), 0);
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


                }
            });

    }
}
