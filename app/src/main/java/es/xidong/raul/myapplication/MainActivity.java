package es.xidong.raul.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;
    ImageView imageview;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textview = (TextView) findViewById(R.id.textView_activity_main);
         button = (Button) findViewById(R.id.button_activity_main);
         imageview = (ImageView) findViewById(R.id.imageView_activity_main);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 contador+=1;
                 textview.setText(String.valueOf(contador));
             }
         });

         imageview.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 contador-=1;
                 textview.setText(String.valueOf(contador));
             }
         });
    }
}
