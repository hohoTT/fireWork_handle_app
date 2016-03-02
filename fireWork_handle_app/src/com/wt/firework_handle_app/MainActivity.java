package com.wt.firework_handle_app;

import com.wt.firework_handle_app.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // 火灾现场计算
        Button btu_fire_calculate = (Button) findViewById(R.id.btu_fire_calculate);
        
        // 火灾现场计算的处理事件
        btu_fire_calculate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				// 实现页面的跳转
				Intent intent = new Intent(MainActivity.this, fire_calculate.class);
				startActivity(intent);
				
			}
		});
        
        // 火灾预案
        Button btu_fire_plan = (Button) findViewById(R.id.btu_fire_plan);
        
        // 
        btu_fire_plan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现页面的跳转
				
			}
		});
    }
    
}
