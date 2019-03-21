package sumith.pacasian.pacy.op_zoek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread splashThread= new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    int wait=0;
                    while(wait<1000)
                    {
                        sleep(100);
                        wait+=100;
                    }
                } catch (InterruptedException e) {

                }finally {
                    finish();
                    Intent n=new Intent(SplashScreen.this,Home.class);
                    startActivity(n);
                }
            }
        };
        splashThread.start();
    }
}
