package com.example.udiploma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.text.Spanned;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CGPA_Activity extends AppCompatActivity {

    TextView tv_display, tv_input;
    private EditText edt1, edt2, edt3, edt4, edt5, edt6, edt7, edt8;
    private Double semester1, semester2, semester3, semester4, semester5, semester6, semester7, semester8;
    private String a,b,c,d,e,f,g,h;;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p_a_);

        edt1 = (EditText) findViewById(R.id.editText1);
        edt1.setFilters(new InputFilter[]{new DecimalDigitsInputFilter(5, 2)});
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);
        edt4 = (EditText) findViewById(R.id.editText4);
        edt5 = (EditText) findViewById(R.id.editText5);
        edt6 = (EditText) findViewById(R.id.editText6);
        edt7 = (EditText) findViewById(R.id.editText7);
        edt8 = (EditText) findViewById(R.id.editText8);

        tv_display = findViewById(R.id.tv_displayId);

        findViewById(R.id.btn_calculate).setOnClickListener((View view) ->{
            claculation();
        });

        findViewById(R.id.btn_reset).setOnClickListener((View view)->{
            restart();
        });
    }

    private void claculation() {
        try
        {
            if (edt1.getText().toString().length()==0){
                semester1 = 0.0;
            }else{
                semester1 = Double.parseDouble(edt1.getText().toString());
            }
            if (edt2.getText().toString().length()==0){
                semester2 = 0.0;
            }else{
                semester2 = Double.parseDouble(edt2.getText().toString());
            }
            if (edt3.getText().toString().length()==0){
                semester3 = 0.0;
            }else{
                semester3 = Double.parseDouble(edt3.getText().toString());
            }
            if (edt4.getText().toString().length()==0){
                semester4 = 0.0;
            }else{
                semester4 = Double.parseDouble(edt4.getText().toString());;
            }
            if (edt5.getText().toString().length()==0){
                semester5 = 0.0;
            }else{
                semester5 = Double.parseDouble(edt5.getText().toString());;
            }
            if (edt6.getText().toString().length()==0){
                semester6 = 0.0;
            }else{
                semester6 = Double.parseDouble(edt6.getText().toString());;
            }
            if (edt7.getText().toString().length()==0){
                semester7 = 0.0;
            }else{
                semester7 = Double.parseDouble(edt7.getText().toString());;
            }
            if (edt8.getText().toString().length()==0){
                semester8 = 0.0;
            }else{
                semester8 = Double.parseDouble(edt8.getText().toString());;
            }
            Double result = (semester1 * 0.05) + (semester2*0.05) + (semester3*0.05) + (semester4*0.10) + (semester5*0.15) + (semester6*0.20) + (semester7*0.25) + (semester8*0.15);
            tv_display.setText("CGPA: "+(new DecimalFormat("##.##").format(result)));
        }catch (Exception e)
        {
            Toast.makeText(this, "Error: "+e.getMessage().toString(), Toast.LENGTH_SHORT).show();
        }
    }
    private void restart() {
        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
        edt4.setText("");
        edt5.setText("");
        edt6.setText("");
        edt7.setText("");
        edt8.setText("");
        tv_display.setText("Please Enter Your GPA: "+" ");
    }
    class DecimalDigitsInputFilter implements InputFilter {
        private Pattern mPattern;
        DecimalDigitsInputFilter(int digitsBeforeZero, int digitsAfterZero) {
            mPattern = Pattern.compile("[0-9]{0," + (digitsBeforeZero - 1) + "}+((\\.[0-9]{0," + (digitsAfterZero - 1) + "})?)||(\\.)?");
        }
        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            Matcher matcher = mPattern.matcher(dest);
            if (!matcher.matches())
                return "";
            return null;
        }
    }

}
