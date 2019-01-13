package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class  muscletech extends AppCompatActivity {
    private ViewFlipper vf;
    private ViewFlipper vf1;
    private ViewFlipper vf3;
    private Button button2;
    private Button button4;
    private Button button19;
    private Button button20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isopure);
        vf = findViewById(R.id.vf);
        vf.setFlipInterval(3000);
        vf.startFlipping();
        vf1 = findViewById(R.id.vf1);
        vf1.setFlipInterval(1500);
        vf1.startFlipping();
        vf3 = findViewById(R.id.vf3);
        vf3.setFlipInterval(300);
        vf3.startFlipping();

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2D47dK4"
                        )));
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2RKaTZF"
                        )));
            }
        });
        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2RrQ9GW"
                        )));
            }
        });
        button20 = findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2RMp9Bb"
                        )));
            }
        });
    }
}
