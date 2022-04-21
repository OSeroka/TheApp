package za.ac.iie.opsc.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CollectionsDescription extends AppCompatActivity {

    private FloatingActionButton button;
    private ListView listV;
    private ArrayList<String> collectArray;
    private  ArrayAdapter<String> collectArrayAdapter;
    private Button buttonAdd;
    private Toolbar toolbar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections_description);


        button = findViewById(R.id.theNext);
        listV = findViewById(R.id.listForCollections);
        buttonAdd = findViewById(R.id.addBtn);
        toolbar1 = findViewById(R.id.tooll);
        toolbar1.setTitle(getIntent().getExtras().getString("name"));



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(CollectionsDescription.this, Collections.class);
                startActivity(l);


            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addToTheCollection();
            }
        });


        collectArray = new ArrayList<>();
        collectArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, collectArray);

        listV.setAdapter(collectArrayAdapter);




    }

    private void addToTheCollection() {


        collectArrayAdapter.add( getIntent().getExtras().getString("Title"));
    }
}