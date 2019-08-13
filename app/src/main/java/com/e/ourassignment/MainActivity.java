package com.e.ourassignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText typesomething;
    private Button next;
    private String myname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        typesomething = (EditText)findViewById(R.id.et_typesomething_id);
        next   = (Button) findViewById(R.id.bt_next_id);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                myname = typesomething.getText().toString();
                intent.putExtra("value",myname);
                startActivity(intent);
                finish();




            }
        });


    }
}
