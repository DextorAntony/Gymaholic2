package technocrats.com.gymaholic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
private Intent home,dash,note;
private Intent diet;
private WebView mWebview;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                 home=new Intent(getBaseContext(),MainActivity.class);
                 startActivity(home);
                    return true;
                case R.id.navigation_dashboard:
                    //home=new Intent(getBaseContext(),home.class);
                    //startActivity(home);
                    return true;
                case R.id.navigation_notifications:
                   // mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent warm = new Intent(getApplicationContext(),home.class);
                startActivity(warm);





            }
        });


        ImageButton chest =(ImageButton)findViewById(R.id.chest);
        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chest = new Intent(getApplicationContext(),chest.class);
                startActivity(chest);
            }
        });

       ImageButton imgsh =(ImageButton)findViewById(R.id.imgsh);
       imgsh.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent sh = new Intent(getApplicationContext(),shoulder.class);
               startActivity(sh);
           }
       });
       ImageButton bicepb =(ImageButton)findViewById(R.id.bicepb);
       bicepb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bicep = new Intent(getApplicationContext(),bicep.class);
               startActivity(bicep);
           }
       });
       ImageButton backb =(ImageButton)findViewById(R.id.backb);
       backb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent bck = new Intent(getApplicationContext(),back.class);
               startActivity(bck);
           }
       });
       ImageButton tricepb =(ImageButton)findViewById(R.id.tricepb);
       tricepb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent tri = new Intent(getApplicationContext(),tricep.class);
               startActivity(tri);
           }
       });

       ImageButton quadb =(ImageButton)findViewById(R.id.quadb);
       quadb.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent quad = new Intent(getApplicationContext(),quad.class);
               startActivity(quad);
           }
       });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
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
            mWebview = new WebView(this);
            mWebview.loadUrl("https://bit.ly/2OsxpEN");
            setContentView(mWebview);
            super.onBackPressed();
            finish();
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
            diet=new Intent(getBaseContext(),diet.class);
            startActivity(diet);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
