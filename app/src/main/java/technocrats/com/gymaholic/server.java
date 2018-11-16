package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class server extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        Button server = findViewById(R.id.Server);
        server.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent quote = new Intent(getApplicationContext(),quote.class);
               startActivity(quote);
            }
        });
    }
}
