package za.ac.iie.opsc.myapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Collections extends AppCompatActivity {

    private EditText title;
    private ArrayList<String> items_collection;
    private ArrayAdapter<String> items_collection_Adapter;
    private ListView listView2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);



        button = findViewById(R.id.submit_btn);
        title = findViewById(R.id.item_Title);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titleName = title.getText().toString();
                Intent m = new Intent(Collections.this, CollectionsDescription.class);
                m.putExtra("Title", titleName);
                startActivity(m);



            }
        });




    }


}