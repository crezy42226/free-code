package com.alshahari.crezy.grand_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_day,spinner_month,spinner_yaer;
    Button bte_copleted;
    RadioGroup radioGroup;
    RadioButton radioButton;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence>adapter1;
    ArrayAdapter<CharSequence>adapter2;
    String text;
    String text2;
    String text3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_day = findViewById(R.id.spinner_id);
        spinner_month = findViewById(R.id.spinner_month);
        spinner_yaer = findViewById(R.id.spinner_Yaer);
        bte_copleted = findViewById(R.id.btn_copleeted);
        radioGroup = findViewById(R.id.group_radio);

Lists();









    }

    public void Lists(){
        adapter = ArrayAdapter.createFromResource(this,R.array.number,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_day.setAdapter(adapter);
        spinner_day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                text = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        adapter1 = ArrayAdapter.createFromResource(this,R.array.monthe,android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_month.setAdapter(adapter1);
        spinner_month.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text2 = adapterView.getItemAtPosition(i).toString();




            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        adapter2 = ArrayAdapter.createFromResource(this,R.array.yeurs,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_yaer.setAdapter(adapter2);
        spinner_yaer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                text3 = adapterView.getItemAtPosition(i).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        bte_copleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i_reg = radioGroup.getCheckedRadioButtonId();

                radioButton =findViewById(i_reg);
                if (radioButton != null) {


                if(radioButton.getId()==R.id.male_radio){
                    Toast.makeText(MainActivity.this,"تاريخ الميلاد"+"   "+"this male"+"  "+ text +"/ "+ text2 + "/  "+text3,Toast.LENGTH_LONG).show();
                }
                if(radioButton.getId()==R.id.fimail_radio){
                    Toast.makeText(MainActivity.this,"تاريخ الميلاد"+"    "+"this fmale"+"   "+ text +" /"+ text2 + "  /"+text3,Toast.LENGTH_LONG).show();

                }
                }else {
                    Toast.makeText(MainActivity.this,"no selected ",Toast.LENGTH_LONG).show();
                }



            }
        });


    }

}
