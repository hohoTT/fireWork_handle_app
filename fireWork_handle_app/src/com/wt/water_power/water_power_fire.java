package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

// 火场供水压力计算的处理类
public class water_power_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.water_power_fire);
		
		// 按下按钮，跳转到建筑火灾情况下的处理类
		Button btu_water_power_fire_building = (Button) findViewById(R.id.btu_water_power_fire_building);
		
		// 建筑火灾按钮的处理事件
		btu_water_power_fire_building.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现跳转到建筑火灾情况下的处理类
				Intent intent = new Intent(water_power_fire.this, water_power_fire_building.class);
				startActivity(intent);
			}
		});
		
		// 按下按钮，跳转到油罐火灾情况下的处理类
		Button btu_water_power_fire_oilcan = (Button) findViewById(R.id.btu_water_power_fire_oilcan);

        // 设置按钮的透明度
        btu_water_power_fire_oilcan.getBackground().setAlpha(100);
        
		// 油罐火灾按钮的处理事件
		btu_water_power_fire_oilcan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现跳转到油罐 火灾情况下的处理类
				Intent intent = new Intent(water_power_fire.this, water_power_fire_oilcan.class);
				startActivity(intent);
			}
		});
	}
	
}
