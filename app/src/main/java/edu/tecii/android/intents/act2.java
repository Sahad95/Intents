package edu.tecii.android.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yoshimi on 16/11/2016.
 */
public class act2 extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg);

        Bundle Infoact1 = getIntent().getExtras();
        if (Infoact1==null)
        {
            return;
        }

        String Mensajeact1 = Infoact1.getString("Mensajeact1");

        final TextView txtact2 = (TextView) findViewById(R.id.txtTocino);
        txtact2.setText(Mensajeact1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }


        });


    }

    public void onClick(View view){

        Intent i = new Intent(this, act1.class);
        startActivity(i);

    }
}
