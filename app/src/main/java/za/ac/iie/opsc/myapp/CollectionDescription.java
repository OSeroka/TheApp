package za.ac.iie.opsc.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CollectionDescription extends AppCompatActivity {




    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;

    private ArrayList<String> items_collection;
    private ArrayAdapter<String> items_collection_Adapter;
    private ListView listView2;
    private TextView t;
    private Button btn;
    private EditText ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_description);




        toolbar = findViewById(R.id.tooll);
        floatingActionButton = findViewById(R.id.buttonNext);




        String g = getIntent().getExtras().getString("Title");





        toolbar.setTitle(getIntent().getExtras().getString("name"));

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o  = new Intent(CollectionDescription.this, Collections.class);
                startActivity(o);
            }
        });








    }


}