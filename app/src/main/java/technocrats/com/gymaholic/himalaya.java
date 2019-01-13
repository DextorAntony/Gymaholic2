package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class himalaya extends AppCompatActivity {
    private ViewFlipper vf;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himalaya);
        vf = findViewById(R.id.vf);
        vf.setFlipInterval(300);
        vf.startFlipping();
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse(
                                "https://amzn.to/2VLUPWJ"
                        )));
            }
        });
    }
}