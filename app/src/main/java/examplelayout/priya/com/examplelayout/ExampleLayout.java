package examplelayout.priya.com.examplelayout;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import examplelayout.priya.com.examplelayout.adapter.NumberAdapter;

public class ExampleLayout extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;

    private TextView textView;
    private ListView listView;
    private String[] numbers = new String[100];
    private NumberAdapter numberAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_layout);

        button_1 = findViewById(R.id.layout);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showMyDialog();


            }
        });


        for (int i = 0; i < 100; ++i) {
            numbers[i] = i + "";
        }

        numberAdapter = new NumberAdapter(this, numbers);


        listView = findViewById(R.id.list);
        listView.setAdapter(numberAdapter);

        textView = findViewById(R.id.name);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ExampleLayout.this, "CLICKED", Toast.LENGTH_SHORT).show();
            }
        });


        button_2 = findViewById(R.id.layout1);
        button_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                showMyDialog();


            }
        });


        button_3 = findViewById(R.id.layout2);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                showMyDialog();


            }
        });


        button_4 = findViewById(R.id.layout3);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showMyDialog();



            }
        });
    }

    private void showMyDialog(){


        AlertDialog.Builder builder = new AlertDialog.Builder(ExampleLayout.this);
        builder.setTitle("MY FIRST ALERT DIALOG");
        builder.setMessage("ALERT MESSAGE");


        builder.setNeutralButton("PROCEED", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ExampleLayout.this, "proceed", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ExampleLayout.this, "OK", Toast.LENGTH_SHORT).show();
            }
        });


        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(ExampleLayout.this, "dismiss", Toast.LENGTH_SHORT).show();

            }
        });
        builder.show();


    }
}