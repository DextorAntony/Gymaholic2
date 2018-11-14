package technocrats.com.gymaholic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Intent dash;
    private Intent note;
    private WebView mWebview;

    private WebView webview;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(getBaseContext(), MainActivity.class);
                 startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    Intent abs = new Intent(getBaseContext(), technocrats.com.gymaholic.abs.class);
                   startActivity(abs);
                    return true;
                case R.id.navigation_notifications:

                    Intent loc = new Intent(getBaseContext(), technocrats.com.gymaholic.loc.class);
                    startActivity(loc);

                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ImageButton imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent warm = new Intent(getApplicationContext(),home.class);
                startActivity(warm);





            }
        });


        ImageButton chest = findViewById(R.id.chest);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chest = new Intent(getApplicationContext(),chest.class);
                startActivity(chest);
            }
        });

       ImageButton imgsh = findViewById(R.id.imgsh);
       imgsh.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent sh = new Intent(getApplicationContext(),shoulder.class);
               startActivity(sh);
           }
       });
       ImageButton bicepb = findViewById(R.id.bicepb);
       bicepb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bicep = new Intent(getApplicationContext(),bicep.class);
               startActivity(bicep);
           }
       });
       ImageButton backb = findViewById(R.id.backb);
       backb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bck = new Intent(getApplicationContext(),back.class);
               startActivity(bck);
           }
       });
       ImageButton tricepb = findViewById(R.id.tricepb);
       tricepb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent tri = new Intent(getApplicationContext(),tricep.class);
               startActivity(tri);
           }
       });

       ImageButton quadb = findViewById(R.id.quadb);
       quadb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent quad = new Intent(getApplicationContext(),quad.class);
               startActivity(quad);
           }
       });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent pp = new Intent(getBaseContext(), ppp.class);
            startActivity(pp);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_diet) {
            // Handle the camera action
            Intent diet = new Intent(getBaseContext(), technocrats.com.gymaholic.diet.class);
            startActivity(diet);
        } else if (id == R.id.nav_gallery) {
            Intent video = new Intent(getBaseContext(), abs.class);
            startActivity(video);

        } else if (id == R.id.nav_slideshow) {

            Intent alarm = new Intent(getBaseContext(), MainActivity2.class);
startActivity(alarm);

        } else if (id == R.id.nav_manage) {
            Intent quote = new Intent(getBaseContext(),server.class);
            startActivity(quote);

        } else if (id == R.id.nav_share) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Man cannot remake himself without suffering, for he is both the marble and the sculptor. Download Now to Sculpt Yourself: https://play.google.com/store/apps/details?id=technocrats.com.gymaholic\"";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "Share via"));

        }

        else if (id == R.id.fb){
           startActivity(new Intent(Intent.ACTION_VIEW,
                   Uri.parse(
                           "https://www.facebook.com/tamilfitnesss/"
                   )));
        }
else if (id==R.id.insta){
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(
                            "https://www.instagram.com/Tamil_Fitness/"
                    )));
        }

        else if (id == R.id.nav_send) {


            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse(
                            "https://api.whatsapp.com/send?phone=+919943847048&text=Hey%20there%20%20i'm%20Dextor%20I'm%20an%202nd%20year%20CS%20Engineering%20Student%20with%20Passion%20for%20writing%20Mobile%20Apps%20and%20PUBG!!!%20Feel%20free%20to%20contact%20me.%20Be%20nice%20and%20remember%20THE%20CODE%20OF%20CONDUCT.%20"
                    )));
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
