package sg.edu.rp.c346.id17032457.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //step 1
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //step 2
        cbEnabled = findViewById(R.id.checkBoxEnable);
        btnCheck = findViewById(R.id.btnCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
            if (cbEnabled.isChecked()){
                tvShow.setText("The discount is given");
            }else{
                tvShow.setText("The discount is not given");
            }



    }
});

    }
}
