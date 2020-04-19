package pc.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.human_image_view);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim);
        imageView.startAnimation(animation);
        final Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                }

            }
        };
        thread.start();
    }
}
