package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class loc extends AppCompatActivity {


    private ImageView page1loc,page2loc,page3loc,page4loc,page5loc,page6loc,page7loc,page8loc,page9loc,page10loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loc);

        page1loc=(ImageView)findViewById(R.id.page1loc);
        page1loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page1 = new Intent(getApplicationContext(),page1.class);
                startActivity(page1);
            }
        });

page2loc=(ImageView)findViewById(R.id.page2loc);
page2loc.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent page2=new Intent(getApplicationContext(),page2.class);
        startActivity(page2);
    }
});


        page3loc=(ImageView)findViewById(R.id.page3loc);
        page3loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page3=new Intent(getApplicationContext(),page3.class);
                startActivity(page3);
            }
        });

        page4loc=(ImageView)findViewById(R.id.page4loc);
        page4loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page4=new Intent(getApplicationContext(),page4.class);
                startActivity(page4);
            }
        });


        page5loc=(ImageView)findViewById(R.id.page5loc);
        page5loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page5=new Intent(getApplicationContext(),page5.class);
                startActivity(page5);
            }
        });

        page6loc=(ImageView)findViewById(R.id.page6loc);
        page6loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page6=new Intent(getApplicationContext(),page6.class);
                startActivity(page6);
            }
        });



        page7loc=(ImageView)findViewById(R.id.page7loc);
        page7loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page7=new Intent(getApplicationContext(),page7.class);
                startActivity(page7);
            }
        });

        page8loc=(ImageView)findViewById(R.id.page8loc);
        page8loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page8=new Intent(getApplicationContext(),page8.class);
                startActivity(page8);
            }
        });

        page9loc=(ImageView)findViewById(R.id.page9loc);
        page9loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page9=new Intent(getApplicationContext(),page9.class);
                startActivity(page9);
            }
        });

        page10loc=(ImageView)findViewById(R.id.page10loc);
        page10loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page10=new Intent(getApplicationContext(),page10.class);
                startActivity(page10);
            }
        });





    }
}
