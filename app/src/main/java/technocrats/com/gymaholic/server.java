package technocrats.com.gymaholic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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

        CardView GRID = findViewById(R.id.GRID); // creating a CardView and assigning a value.

        GRID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quote = new Intent(getApplicationContext(),grid.class);
                startActivity(quote);
            }
        });
        CardView LIST = findViewById(R.id.LIST); // creating a CardView and assigning a value.

        LIST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(getApplicationContext(),list.class);
                startActivity(list);
            }
        });
    }
}
