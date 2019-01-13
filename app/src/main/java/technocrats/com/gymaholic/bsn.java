package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class bsn extends AppCompatActivity {
    private ViewFlipper vf;
    private ViewFlipper vf1;
    private ViewFlipper vf3;
    private ViewFlipper vf4;
    private Button button2;
    private Button button4;
    private Button button19;
    private Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsn);

        vf = findViewById(R.id.vf);
        vf.setFlipInterval(3000);
        vf.startFlipping();
        vf1 = findViewById(R.id.vf1);
        vf1.setFlipInterval(1500);
        vf1.startFlipping();
        vf3 = findViewById(R.id.vf3);
        vf3.setFlipInterval(300);
        vf3.startFlipping();
        vf4 = findViewById(R.id.vf4);
        vf4.setFlipInterval(300);
        vf4.startFlipping();
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2HaHiED"
                        )));
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2D6xfwv"
                        )));
            }
        });
        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2AL2fAC"
                        )));
            }
        });
        button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2RmCyjY"
                        )));
            }
        });
    }
}
