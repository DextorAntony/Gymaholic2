package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class loc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loc);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abs = new Intent(getBaseContext(), technocrats.com.gymaholic.abs.class);
                startActivity(abs);
            }
        });


        ImageView page1loc = findViewById(R.id.page1loc);
        page1loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page1 = new Intent(getApplicationContext(),page1.class);
                startActivity(page1);
            }
        });

        ImageView page2loc = findViewById(R.id.page2loc);
page2loc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent page2=new Intent(getApplicationContext(),page2.class);
        startActivity(page2);
    }
});


        ImageView page3loc = findViewById(R.id.page3loc);
        page3loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page3=new Intent(getApplicationContext(),page3.class);
                startActivity(page3);
            }
        });

        ImageView page4loc = findViewById(R.id.page4loc);
        page4loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page4=new Intent(getApplicationContext(),page4.class);
                startActivity(page4);
            }
        });


        ImageView page5loc = findViewById(R.id.page5loc);
        page5loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page5=new Intent(getApplicationContext(),page5.class);
                startActivity(page5);
            }
        });

        ImageView page6loc = findViewById(R.id.page6loc);
        page6loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page6=new Intent(getApplicationContext(),page6.class);
                startActivity(page6);
            }
        });


        ImageView page7loc = findViewById(R.id.page7loc);
        page7loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page7=new Intent(getApplicationContext(),page7.class);
                startActivity(page7);
            }
        });

        ImageView page8loc = findViewById(R.id.page8loc);
        page8loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page8=new Intent(getApplicationContext(),page8.class);
                startActivity(page8);
            }
        });

        ImageView page9loc = findViewById(R.id.page9loc);
        page9loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page9=new Intent(getApplicationContext(),page9.class);
                startActivity(page9);
            }
        });

        ImageView page10loc = findViewById(R.id.page10loc);
        page10loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page10=new Intent(getApplicationContext(),page10.class);
                startActivity(page10);
            }
        });
        ImageView page11 = findViewById(R.id.page11);
        page11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page11=new Intent(getApplicationContext(),page13.class);
                startActivity(page11);
            }
        });

        ImageView page12 = findViewById(R.id.page12);
        page12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page12=new Intent(getApplicationContext(),page12.class);
                startActivity(page12);
            }
        });




    }
}
