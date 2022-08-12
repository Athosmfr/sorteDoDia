package br.com.up.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txt_title;
    private Button btn_action;
    private ArrayList<String> messages = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messages.add("Babiribupi");
        messages.add("Zuleika");
        messages.add("Varapapo");

        txt_title = findViewById(R.id.txt_title);
        btn_action = findViewById(R.id.btn_action);

        //txt_title.setText("Olá Mundo!");
        txt_title.setAllCaps(true);
        txt_title.setTextSize(26);
        txt_title.setTextColor(Color.RED);
        btn_action.setBackgroundColor(Color.RED);

        //btn_action.setOnClickListener(new View.OnClickListener() {})
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = new Random().nextInt(messages.size());
                String message = messages.get(position);
                txt_title.setText(message);
            }
        };

        btn_action.setOnClickListener(listener);
    }
}