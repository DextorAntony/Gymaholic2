package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page11 extends AppCompatActivity {
    private Intent page11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);
        Button homeb = findViewById(R.id.homeb);
        homeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page11=new Intent(getBaseContext(),MainActivity.class);
                startActivity(page11);
            }
        });
    }
}
