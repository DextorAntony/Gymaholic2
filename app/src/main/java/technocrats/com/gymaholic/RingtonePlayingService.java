package technocrats.com.gymaholic;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.util.Objects;
import java.util.Random;

public class RingtonePlayingService extends Service {

    private boolean isRunning;
    private MediaPlayer mMediaPlayer;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("MyActivity", "In service");
        return null;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {

        final NotificationManager mNM = (NotificationManager)
                getSystemService(NOTIFICATION_SERVICE);

        Intent intent1 = new Intent(this.getApplicationContext(), MainActivity2.class);
        PendingIntent pIntent = PendingIntent.getActivity(this, 0, intent1, 0);

        Notification mNotify  = new Notification.Builder(this)
                .setContentTitle("WAKE UP" + "!")
                .setContentText("No Alarm Needed My Passion Wakes Me")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(pIntent)
                .setAutoCancel(true)
                .build();

        String state = Objects.requireNonNull(intent.getExtras()).getString("extra");

        Log.e("what is going on here  ", state);

        assert state != null;
        switch (state) {
            case "no":
                startId = 0;
                break;
            case "yes":
                startId = 1;
                break;
            default:
                startId = 0;
                break;
        }


        if(!this.isRunning && startId == 1) {
            Log.e("if there was not sound ", " and you want start");

            int min = 1;
            int max = 5;

            Random r = new Random();
            int random_number = r.nextInt(max - min + 1) + min;
            Log.e("random number is ", String.valueOf(random_number));

            if (random_number == 1) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.r3);
            }
            else if (random_number == 2) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.r2);

            }
                else if (random_number == 3) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.r1);
            }
 else if (random_number == 4) {
                    mMediaPlayer = MediaPlayer.create(this, R.raw.r4);

                }
            else if (random_number == 5) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.r5);


            }
            else {
                mMediaPlayer = MediaPlayer.create(this, R.raw.r1);
            }
            //mMediaPlayer = MediaPlayer.create(this, R.raw.richard_dawkins_1);

            mMediaPlayer.start();


            Objects.requireNonNull(mNM).notify(0, mNotify);

            this.isRunning = true;

        }
        else if (!this.isRunning){
            Log.e("if there was not sound ", " and you want end");

            this.isRunning = false;

        }

        else if (startId == 1){
            Log.e("if there is sound ", " and you want start");

            this.isRunning = true;

        }
        else {
            Log.e("if there is sound ", " and you want end");

            mMediaPlayer.stop();
            mMediaPlayer.reset();

            this.isRunning = false;
        }


        Log.e("MyActivity", "In the service");

        return START_NOT_STICKY;

    }


    @Override
    public void onDestroy() {
        Log.e("JSLog", "on destroy called");
        super.onDestroy();

        this.isRunning = false;
    }







}
