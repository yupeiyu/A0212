package com.example.administrator.a021;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     EditText n1,n2;
     RadioButton rb1,rb2, rb3,rb4,rb5,rb6;
     CheckBox cb1;
     TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.editText);
        n2=(EditText)findViewById(R.id.editText2);

        rb1=(RadioButton)findViewById(R.id.plus);
        rb2=(RadioButton)findViewById(R.id.minus);
        rb3=(RadioButton)findViewById(R.id.multi);
        rb4=(RadioButton)findViewById(R.id.divise);
        rb5=(RadioButton)findViewById(R.id.yuShu);
        rb6=(RadioButton)findViewById(R.id.ciFang);

        cb1=(CheckBox)findViewById(R.id.integer);

        tv1=(TextView)findViewById(R.id.ans);




    }
    public void b1CalOnClick(View v){
        try {
            double nn1=Double.parseDouble(n1.getText().toString());
            double nn2=Double.parseDouble(n2.getText().toString());
            double rr=0.0;


            if (rb1.isChecked()){
                rr=nn1+nn2;
            }
            else if (rb2.isChecked()){
                rr=nn1-nn2;
            }
            else if (rb3.isChecked()){
                rr=nn1*nn2;
            }
            else if(rb4.isChecked())
            {
                if (cb1.isChecked())
                {
                    tv1.setText((long)(nn1/nn2)+"");
                    return;
                }
                else {
                   rr=nn1/nn2;
                }

            }
            tv1.setText(rr+"");
        }
        catch (Exception e){
            tv1.setText(e.getMessage());
        }
    }
}
