package com.example.ignaciosantonjamolina.p3;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.TextView;

/**
 * Created by ignaciosantonjamolina on 28/2/17.
 */

public class ScoreActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

    // Class for accessing an application's resources.
    Resources res = getResources();

    TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
    tabs.setup();

    TabHost.TabSpec spec=tabs.newTabSpec("mitab1");
    spec.setContent(R.id.tab1);
    spec.setIndicator("Local");
            //res.getDrawable(android.R.drawable.ic_btn_speak_now, ));

        tabs.addTab(spec);

    spec=tabs.newTabSpec("mitab2");
    spec.setContent(R.id.tab2);
    spec.setIndicator("Friends");
            //res.getDrawable(android.R.drawable.ic_dialog_map, ));
    tabs.addTab(spec);

    tabs.setCurrentTab(0);

//    final TextView a = (TextView)findViewById(R.id.a);
//    String nombreScore1 = a.getText().toString();
//        nombreScore1 += "Nacho San";
//        a.setText(nombreScore1);
//
//        final TextView b = (TextView)findViewById(R.id.b);
//        String scoreNombre1 = a.getText().toString();
//        scoreNombre1 += "3000";
//        b.setText(scoreNombre1);

}
}