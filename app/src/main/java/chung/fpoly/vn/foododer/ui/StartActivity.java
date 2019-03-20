package chung.fpoly.vn.foododer.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import chung.fpoly.vn.foododer.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void Start(View view) {
        startActivity(new Intent(StartActivity.this,MenuActivity.class));
    }
}
