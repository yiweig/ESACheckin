package edu.emory.esacheckin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yiweigao on 4/30/15.
 */

public class SettingsActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        
    }
}
