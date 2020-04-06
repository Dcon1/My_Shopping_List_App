package au.edu.jcu.sp3406.myshoppinglistapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        String[] list = new String[]{"test1", "test2"};
        List<String> shopList = new ArrayList<String>(Arrays.asList(list));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shopList);
        listView.setAdapter(arrayAdapter);

    }

    public void addButton(View view){
        TextView textView = findViewById(R.id.text);
        String testString = textView.toString();
        //cant see list to add to it from button -- if I move list to main activity I can see it but app crashes.

    }
}