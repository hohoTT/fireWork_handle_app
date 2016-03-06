package com.wt.firework_handle_app;

import com.wt.firework_handle_app.R;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
//        GradientDrawable drawable = new GradientDrawable();
//        drawable.setShape(GradientDrawable.RECTANGLE); // 画框  
//        drawable.setStroke(1, Color.BLUE); // 边框粗细及颜色  
//        drawable.setColor(0x22FFFF00); // 边框内部颜色  
        
        
        // 火灾现场计算
        Button btu_fire_calculate = (Button) findViewById(R.id.btu_fire_calculate);
        
//        btu_fire_calculate.setBackgroundDrawable(drawable);
        
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
        
        // 设置按钮的透明度
        btu_fire_plan.getBackground().setAlpha(100);
        
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
