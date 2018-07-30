package com.example.park.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class widgetActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox cbApple;
    CheckBox cbBanana;
    CheckBox cbCherry;
    RadioGroup rg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget);

        cbApple = (CheckBox)findViewById(R.id.cbApple);
        cbBanana= (CheckBox)findViewById(R.id.cbBanana);
        cbCherry = (CheckBox)findViewById(R.id.cbCherry);

        cbApple.setOnCheckedChangeListener(this);
        cbBanana.setOnCheckedChangeListener(this);
        cbCherry.setOnCheckedChangeListener(this);
        rg=(RadioGroup)findViewById(R.id.rbgroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int button_id) {
                switch(button_id){
                    case R.id.rbAnaconda:
                        Toast.makeText(widgetActivity.this,"Anaconda 라디오버튼",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbBear:
                        Toast.makeText(widgetActivity.this,"Bear 라디오버튼",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbCat:
                        Toast.makeText(widgetActivity.this,"Cata 라디오버튼",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton cb, boolean flag) {
        switch(cb.getId()){
            case R.id.cbApple:
                Toast.makeText(widgetActivity.this,"사과체크됨="+flag,Toast.LENGTH_SHORT).show();
                break;
            case R.id.cbBanana:
                Toast.makeText(widgetActivity.this,"바나나체크됨="+flag,Toast.LENGTH_SHORT).show();
                  break;
            case R.id.cbCherry:
                Toast.makeText(widgetActivity.this,"체리 체크됨="+flag,Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
