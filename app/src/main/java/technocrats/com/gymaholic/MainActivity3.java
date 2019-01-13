package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opt = new Intent(getApplicationContext(),optnut.class);
                startActivity(opt);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mb = new Intent(getApplicationContext(),mb.class);
                startActivity(mb);
            }
        });

        imageView =(ImageView)findViewById(R.id.imageView3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent un = new Intent(getApplicationContext(),unutrition.class);
                startActivity(un);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView4);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hk = new Intent(getApplicationContext(),healthkart.class);
                startActivity(hk);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView5);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hp = new Intent(getApplicationContext(),horlicks.class);
                startActivity(hp);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView6);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent px = new Intent(getApplicationContext(),proteinx.class);
                startActivity(px);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView7);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mct = new Intent(getApplicationContext(),muscletech.class);
                startActivity(mct);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView8);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iso = new Intent(getApplicationContext(),isopure.class);
                startActivity(iso);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView9);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bsn = new Intent(getApplicationContext(),bsn.class);
                startActivity(bsn);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView10);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent px = new Intent(getApplicationContext(),mpharm.class);
                startActivity(px);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView11);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hm = new Intent(getApplicationContext(),himalaya.class);
                startActivity(hm);
            }
        });
        imageView =(ImageView)findViewById(R.id.imageView12);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dm = new Intent(getApplicationContext(),dymatize.class);
                startActivity(dm);
            }
        });
    }
}
