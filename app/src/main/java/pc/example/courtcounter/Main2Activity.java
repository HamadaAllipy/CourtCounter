package pc.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        btn1();
        btn2();
        btn3();
        btn1B();
        btn2B();
        btn3B();
        reat();
    }


    //TODO            //// TEAM (A)
    public void displayForTeamA(int score){
        TextView textView = findViewById(R.id.score);
        textView.setText(String.valueOf(score));
    }
    public void btn1(){
        Button freePoints = findViewById(R.id.freePoints);
        freePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 1 ;
                displayForTeamA(scoreTeamA);
            }
        });
    }

    public void btn2(){
        Button towPoints = findViewById(R.id.twoPoints);
        towPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+ 2;
                displayForTeamA(scoreTeamA);
            }
        });
    }
    public void btn3(){
        Button threePoints = findViewById(R.id.threePoints);
        threePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA= scoreTeamA+ 3;
                displayForTeamA(scoreTeamA);
            }
        });
    }

    //TODO            //// TEAM (B)
    public void displayForTeamB(int score){
        TextView textView = findViewById(R.id.scoreB);
        textView.setText(String.valueOf(score));
    }
    public void btn1B(){
        Button freePoints = findViewById(R.id.freePointsB);
        freePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 1 ;
                displayForTeamB(scoreTeamB);
            }
        });
    }

    public void btn2B(){
        Button towPoints = findViewById(R.id.twoPointsB);
        towPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB+ 2;
                displayForTeamB(scoreTeamB);
            }
        });
    }
    public void btn3B(){
        Button threePoints = findViewById(R.id.threePointsB);
        threePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB= scoreTeamB+ 3;
                displayForTeamB(scoreTeamB);
            }
        });
    }

    // TODO REST
    public void reat(){
        Button button = findViewById(R.id.rest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0 ;
                scoreTeamB = 0 ;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
            }
        });
    }
}
