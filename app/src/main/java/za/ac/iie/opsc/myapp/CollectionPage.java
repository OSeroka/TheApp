package za.ac.iie.opsc.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CollectionPage extends AppCompatActivity {


    private FloatingActionButton floatingActionButton;
    private ArrayList<String> items;
    private ArrayAdapter<String> itemAdapter;
    private ListView listView;
    private EditText collectionName;
    private Toolbar toolbar;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_page);

        floatingActionButton = findViewById(R.id.add);
        listView = findViewById(R.id.listView);
        toolbar = findViewById(R.id.toolbarCollectionPage);
        toolbar.setTitle("Collectify");



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                String n = listView.getAdapter().getItem(i).toString();

                Intent v = new Intent(CollectionPage.this , CollectionsDescription.class);
                v.putExtra("name", n);
                startActivity(v);



            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addItem(view);
            }
        });








        items = new ArrayList<>();
        itemAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(itemAdapter);


    }

    private void addItem(View view) {

        collectionName = findViewById(R.id.CollectionName);
        String itemText = collectionName.getText().toString();

        if(!(itemText.equals("")))
        {
             itemAdapter.add(itemText);
            collectionName.setText("");

        }
        else{
            Toast.makeText(getApplicationContext(), "Please enter collection name", Toast.LENGTH_LONG).show();
        }





    }






}