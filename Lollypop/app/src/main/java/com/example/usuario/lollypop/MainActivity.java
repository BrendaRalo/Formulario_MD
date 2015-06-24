package com.example.usuario.lollypop;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;


public class MainActivity extends Activity {
    EditText editText;
    TextView textView;
    Spinner spinner;
    String[] dia = {"01","02","03","04","05","06","07","08","09","10","11","12","13"};
    String[] mes = {"Mes","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Dicembre"};
    String[] año = {"2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> Adia = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,dia);
        ArrayAdapter<String> Ames = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mes);
        ArrayAdapter<String> Aaño = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,año);
        spinner.setAdapter(Adia);
        spinner.setAdapter(Ames);
        spinner.setAdapter(Aaño);



    }
    /*public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.fem:
                if (checked)
                    textView.setText("Femenino");
                    break;
            case R.id.mas:
                if (checked)
                    textView.setText("Masculino");
                    break;
        }
    }*/
    public void onClic(View view){
        editText=(EditText) findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.Tnombre);



        String s=editText.getText().toString();
        textView.setText("Hola " + s);
    }
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Do something with the time chosen by the user
    }
}
