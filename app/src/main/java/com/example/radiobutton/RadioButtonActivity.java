package com.example.radiobutton;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RadioButtonActivity extends AppCompatActivity{

    private View constraintParticular;
    private View constraintBussiness;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        constraintParticular = findViewById(R.id.constraintParticular);
        constraintBussiness = findViewById(R.id.constraintBussines);

    }

    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.rbtParticular:
                viewParticular(true);
                break;
            case R.id.rbtBussines:
                viewParticular(false);
                break;
        }
    }


    private void viewParticular (boolean b)
    {
        constraintParticular.setVisibility(b? View.VISIBLE: View.GONE);
        constraintBussiness.setVisibility(b? View.GONE: View.VISIBLE);

    }
}
