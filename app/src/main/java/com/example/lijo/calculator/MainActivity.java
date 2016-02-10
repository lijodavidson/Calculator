package com.example.lijo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn_add,btn_sub,btn_mul,btn_div;
    private EditText value1,value2;
    double number_1,number_2,answer;
    private TextView dispplay_answer;
    private ListView show;
 private    ArrayList<String> addArray= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn_add=(Button)findViewById(R.id.button_add);
        btn_sub=(Button)findViewById(R.id.button_sub);
        btn_mul=(Button)findViewById(R.id.button_multiply);
        btn_div=(Button)findViewById(R.id.button_divide);
        show=(ListView)findViewById(R.id.listshow);
        value1=(EditText)findViewById(R.id.first_number);
        value2=(EditText)findViewById(R.id.second_number);
        dispplay_answer=(TextView)findViewById(R.id.output);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addition();
            }
        });
        
        
        
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subtraction();
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multiplication();
            }
        });
    }

    private void multiplication() {
        number_1 = Double.parseDouble(value1.getText().toString());
        number_2 = Double.parseDouble(value2.getText().toString());
        answer=number_1*number_2;
        dispplay_answer.setText(Double.toString(answer));
        String getInput=dispplay_answer.getText().toString();
        addArray.add(getInput);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,addArray);
        show.setAdapter(adapter);


    }

    private void division() {
        number_1 = Double.parseDouble(value1.getText().toString());
        number_2 = Double.parseDouble(value2.getText().toString());
        answer=number_1/number_2;
        dispplay_answer.setText(Double.toString(answer));
        String getInput=dispplay_answer.getText().toString();
        addArray.add(getInput);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,addArray);
        show.setAdapter(adapter);


    }


    private void subtraction() {
        number_1 = Double.parseDouble(value1.getText().toString());
        number_2 = Double.parseDouble(value2.getText().toString());
        answer=number_1-number_2;
        dispplay_answer.setText(Double.toString(answer));
        String getInput=dispplay_answer.getText().toString();
        addArray.add(getInput);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,addArray);
        show.setAdapter(adapter);

    }

    private void addition() {


        number_1 = Double.parseDouble(value1.getText().toString());
        number_2 = Double.parseDouble(value2.getText().toString());
        answer=number_1+number_2;
       dispplay_answer.setText(Double.toString(answer));
        String getInput=dispplay_answer.getText().toString();
        addArray.add(getInput);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,addArray);
        show.setAdapter(adapter);


    }

   
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
