package in.supertroninfotech.httpwww.formlandscape;

import android.content.Context;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv_one, tv_two, tv_three;
    Button btn_submit, btn_checkval;
    Context mContext;
    String val1, val2, val3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            val1 = savedInstanceState.getString("val1");
            val2 = savedInstanceState.getString("val2");
            val3 = savedInstanceState.getString("val3");
        }

        mContext = this;
        initialization();
    }


    private void initialization() {
        tv_one = findViewById(R.id.tv_one);
        tv_two = findViewById(R.id.tv_two);
        tv_three = findViewById(R.id.tv_three);
        btn_checkval = findViewById(R.id.btn_checkval);

        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = tv_one.getText().toString();
                val2 = tv_two.getText().toString();
                val3 = tv_three.getText().toString();
                Toast.makeText(mContext, val1 + " : " + val2 + " : " + val3, Toast.LENGTH_SHORT).show();

            }
        });

        btn_checkval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, val1 + " : " + val2 + " : " + val3, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("val1", val1);
        outState.putString("val2", val2);
        outState.putString("val3", val3);
    }
}
