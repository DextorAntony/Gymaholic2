package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class mb extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mb);

        ViewFlipper vf = findViewById(R.id.vf);
        vf.setFlipInterval(1400);
        vf.startFlipping();
        ViewFlipper vf1 = findViewById(R.id.vf1);
        vf1.setFlipInterval(1500);
        vf1.startFlipping();
        ViewFlipper vf3 = findViewById(R.id.vf3);
        vf3.setFlipInterval(1300);
        vf3.startFlipping();
        ViewFlipper vf4 = findViewById(R.id.vf4);
        vf4.setFlipInterval(1400);
        vf4.startFlipping();
        ViewFlipper vf5 = findViewById(R.id.vf5);
        vf5.setFlipInterval(1350);
        vf5.startFlipping();
        ViewFlipper vf6 = findViewById(R.id.vf6);
        vf6.setFlipInterval(1400);
        vf6.startFlipping();

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2VOR2b3"
                        )));
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2SQp6l3"
                        )));
            }
        });
        Button button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2SRjDdX"
                        )));
            }
        });
        Button button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2SQpEr7"
                        )));
            }
        });
        Button button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2D7IXH9"
                        )));
            }
        });
        Button button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2CmHKdA"
                        )));
            }
        });
    }
}
