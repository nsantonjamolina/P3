package com.example.ignaciosantonjamolina.p3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
        This method is executed when the activity is created to populate the ActionBar with actions
     */

    public boolean onCreateOptionsMenu(Menu menu) {
        // Generate the Menu object from the XML resource file
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        //getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }

//    /*
//        This method is executed when any action from the ActionBar is selected
//    */
//    public void onGroupItemClick(MenuItem item) {
//        if(item.getItemId() == R.id.credits){
//            // There is no Internet connection available, so inform the user about that
//            Toast.makeText(this, item.getItemId() , Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(this, CreditsActivity.class);
//        startActivity(intent);
//    }
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.credits:
                Log.i("ActionBar", "Nuevo!");
                Intent intent = new Intent(this, CreditsActivity.class);
                startActivity(intent);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
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
