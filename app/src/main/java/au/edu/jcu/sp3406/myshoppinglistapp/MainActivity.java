package au.edu.jcu.sp3406.myshoppinglistapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    ArrayList<TextView> list = new ArrayList<TextView>();
    ArrayAdapter<TextView> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        setListAdapter(adapter);
    }

    public void addButton(View view) {
        TextView text = findViewById(R.id.text);
        list.add(text);

    }

    public void settingsButton(View view){

    }
}
