package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class optnut extends AppCompatActivity {
private ViewFlipper vf;
private ViewFlipper vf1;
private ViewFlipper vf3;
private ViewFlipper vf4;
    private ViewFlipper vf5; private ViewFlipper vf6;
    private Button button2;
    private Button button4;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optnut);

        vf = findViewById(R.id.vf);
        vf.setFlipInterval(1200);
        vf.startFlipping();
        vf1 = findViewById(R.id.vf1);
        vf1.setFlipInterval(1100);
        vf1.startFlipping();
        vf3 = findViewById(R.id.vf3);
        vf3.setFlipInterval(1300);
        vf3.startFlipping();
        vf4 = findViewById(R.id.vf4);
        vf4.setFlipInterval(1200);
        vf4.startFlipping();
        vf5 = findViewById(R.id.vf5);
        vf5.setFlipInterval(1300);
        vf5.startFlipping();
        vf6 = findViewById(R.id.vf6);
        vf6.setFlipInterval(1200);
        vf6.startFlipping();

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2VJScoh"
                        )));
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2VRQ5i3"
                        )));
            }
        });
        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2ST7WmQ"
                        )));
            }
        });
        button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2Ci9BeF"
                        )));
            }
        });
        button21 = findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2RQdh0W"
                        )));
            }
        });
        button22 = findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2Ch3pnj"
                        )));
            }
        });
         }

    }
