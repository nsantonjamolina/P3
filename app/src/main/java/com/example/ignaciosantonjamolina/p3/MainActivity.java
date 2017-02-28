package com.example.ignaciosantonjamolina.p3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    public void onGroupItemClick(MenuItem item) {
        // One of the group items (using the onClick attribute) was clicked
        // The item parameter passed here indicates which item it is
        // All other menu item clicks are handled by onOptionsItemSelected()
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        Método para ejecutar las diferentes actividades cuando se hace click en algún botón del dashboard
    */
    public void dashboardButtonClicked(View v){

        //Objeto intent para lanzar las actividades relacionadas
        Intent intent = null;

        //Determinar el activity a lanzar de acuerdo al id the botón
        switch (v.getId()){

            case R.id.bPlay:
                intent = new Intent(this, PlayActivity.class);
                break;

            case R.id.bScore:
                intent = new Intent(this, ScoreActivity.class);

                break;

            case R.id.bSettings:
                intent = new Intent(this, SettingsActivity.class);
                break;
        }

        // Lanzar la actividad indicada
        if(intent != null) startActivity(intent);

    }
}
