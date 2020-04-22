package au.edu.jcu.sp3406.myshoppinglistapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private ArrayAdapter<String> adapter;
    //private ArrayList<TextView> list = new ArrayList<>();
    public Button add;
    private EditText text;
    private Button settings;
    private ListView shopList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //shopList = (ListView) findViewById(R.id.list);
        text = (EditText) findViewById(R.id.text);
        add = (Button) findViewById(R.id.add);
        settings = (Button) findViewById(R.id.settings);

        //adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1); I cannot get this to work, I can't seem to understand the list and adapter I thought it would be as easy of adding the new item to the list?
        //shopList.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getItem = text.getText().toString();
                adapter.add(getItem);
                text.setText("");
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });
    }
}
