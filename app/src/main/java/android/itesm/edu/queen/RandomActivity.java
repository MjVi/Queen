package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    private TextView aleatorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        Intent intent = new Intent();
        int i = (int) (Math.random() * 7);
        ((TextView)findViewById(R.id.textView)).setText(opciones[i]);
        //intent.putExtra("random", opciones);
        //setResult(Activity.RESULT_OK, intent);

    }
    public String opciones[] = {"Bohemian Rhapsody","Another one bites the dust","I want to break free","Don't stop me now","The show must go on","Under Pressure","Champions"};

    public void done(View view){
        finish();
    }
    public void ir(View view){
        finish();
    }
}
