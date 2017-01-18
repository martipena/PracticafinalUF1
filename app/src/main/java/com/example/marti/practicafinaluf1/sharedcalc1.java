package com.example.marti.practicafinaluf1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sharedcalc1 extends AppCompatActivity {

    boolean hayPunto = false;
    String punto = ",";
    String pantalla = "0";
    int op = 0;
    int opsig = 0;
    double v0 = 0; //primer argumento
    double v1 = 0; //segundo argumento, es el que se está introduciendo
    String res="";
    //después de cada operación se hará: v0 = v1

    int operacion = 0; //operación que se realizará

    TextView txPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sharedcalc);

        txPantalla = (TextView) findViewById(R.id.textView3);
    }

    double opera( double a, double b, int op ){
        double res = 0;
        //vigilar con la división entre 0. Se puede poner una variable para indicar los errores
        switch( op ){ //aprovechamos la referencia al botón para especificar que operación haremos
            case R.id.btMas:
                res = a + b;
                break;
            case R.id.btMenos:
                res = a - b;
                break;
            case R.id.btX:
                res = a * b;
                break;
            case R.id.btDiv:
                res = a / b;
                break;

        }
        return res;
    }

    double queDouble( String s ){
        String ss = s.replace(punto.charAt(0), '.' );
        double res = Double.parseDouble(ss);
        //pasamos de string a res

        return res;
    }

    String queString(double s ){
       // String ss = s.replace(punto.charAt(0), '.' );
       // double res = Double.parseDouble(ss);
        double ss = s;
        String res = String.valueOf(ss);
        //pasamos de string a res

        return res;
    }

    void muestra( String s ){
        txPantalla.setText(s);
    }


    public void clickBoton(View v) {
        int n;
        //if( v.getClass() == Button.class ){
            Button b = (Button) v;
            switch( b.getId() ){
                case R.id.bt0:
                case R.id.bt1:
                case R.id.bt2:
                case R.id.bt3:
                case R.id.bt4:
                case R.id.bt5:
                case R.id.bt6:
                case R.id.bt7:
                case R.id.bt8:
                case R.id.bt9:
                    n = Integer.parseInt( b.getText().toString());
                    pantalla = pantalla + n;
                    break;
                case R.id.btPunto: //pulsado punto
                    if( !hayPunto ){
                        pantalla = pantalla + punto;
                    }
                    break;
                case R.id.btMas:
                    opsig =  b.getId();
                    v1 = queDouble( pantalla );
                    v0 = opera( v0, v1, op );
                    res = queString(v0);
                    muestra( res );
                    op = opsig;
                    break;
                case R.id.btDiv:
                    opsig =  b.getId();
                    v1 = queDouble( pantalla );
                    v0 = opera( v0, v1, op );
                    res = queString(v0);
                    muestra( res );
                    op = opsig;
                    break;
                case R.id.btMenos:
                    opsig =  b.getId();
                    v1 = queDouble( pantalla );
                    v0 = opera( v0, v1, op );
                    res = queString(v0);
                    muestra( res );
                    op = opsig;
                    break;
                case R.id.btX:
                    opsig =  b.getId();
                    v1 = queDouble( pantalla );
                    v0 = opera( v0, v1, op );
                    res = queString(v0);
                    muestra( res );
                    op = opsig;
                    break;
                case R.id.btIgual:
                    break;
                case R.id.btMC:
                    break;
                case R.id.btMR:
                    break;
                case R.id.btMemMas:
                    break;

           // }
        }
    }
}