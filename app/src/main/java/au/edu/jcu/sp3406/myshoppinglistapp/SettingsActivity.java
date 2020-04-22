package au.edu.jcu.sp3406.myshoppinglistapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    private int button = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final Button buttonColor = findViewById(R.id.buttonColor);
        final MainActivity mainActivity = new MainActivity();


        buttonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button % 2 == 0) {
                    buttonColor.setBackgroundColor(Color.parseColor("#000000")); //Changing the color of buttons but seems like a long way to do it-- can I change the color reference in colors.xml instead? that would save me changing every button
                    buttonColor.setTextColor(Color.parseColor("#FFFFFF"));
                    mainActivity.add.setBackgroundColor(Color.parseColor("#FFFFFF"));

                } else {
                    buttonColor.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    buttonColor.setTextColor(Color.parseColor("#000000"));
                    //mainActivity.add.setBackgroundColor(Color.parseColor("#000000")); --- I am trying to change the color of the button on main activity but causes the app to crash (hopefully this is not needed if I can change the color from a center location as mentioned above)
                }
                button++;
            }
        });
    }
}
