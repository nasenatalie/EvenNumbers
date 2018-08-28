package iics.nase.natalienicole.evennumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.start);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView answer = (TextView) findViewById(R.id.answer);
                for (int num=1; num<=20; num++){
                    if(num%2 == 0) {
                        answer.append(num + "\n");
                    }
                }
            }
        });

    }
}
