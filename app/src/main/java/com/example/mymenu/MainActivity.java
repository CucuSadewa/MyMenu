package com.example.mymenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMenu = (TextView) findViewById(R.id.tv_menu);
        tvMenu.setText("Selamat Datang Di App Menu");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu1:
                tvMenu.setText("Menu 1");
                Toast.makeText(getApplicationContext(), "Anda Masuk Ke Menu 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu2:
                tvMenu.setText("Menu 2");
                Toast.makeText(getApplicationContext(), "Anda Masuk Ke Menu 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                tvMenu.setText("Menu 3");
                Toast.makeText(getApplicationContext(), "Anda Masuk Ke Menu 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu4:
                tvMenu.setText("Menu 4");
                Toast.makeText(getApplicationContext(), "Anda Masuk Ke Menu 4", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu5:
                tvMenu.setText("Menu 5");
                Toast.makeText(getApplicationContext(), "Anda Masuk Ke Menu 5", Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
