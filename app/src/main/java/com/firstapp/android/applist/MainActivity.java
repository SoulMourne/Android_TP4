package com.firstapp.android.applist;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String[] data = new String[]
            {
                    "Android","Windows Server", "Windows 8",
                    "Unix BSD", "Ubuntu", "Windows 7", "Mac OS X",
                    "Linux Red Hat", "Linux Mint", "Windows 10", "CentOS 7",
                    "Debian 8", "Windows Phone 8"
            };

    private ListView maListe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maListe = (ListView) findViewById(R.id.maListe);
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
        maListe.setAdapter(adapter);
        maListe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), "l'item choisi est : " + data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }


    protected void onListItemClick (AdapterView<?> arg0, View v, int position, long id)
    {

        Toast.makeText(this, "l'item choisi est : " + data[position], Toast.LENGTH_SHORT).show();
    }
}
