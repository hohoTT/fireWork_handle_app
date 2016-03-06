package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class water_power extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.water_power);
		
		// 获取按钮
		Button btu_water_power_fire = (Button) findViewById(R.id.btu_water_power_fire);
		
		// 实现按钮的处理事件
		btu_water_power_fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 按下按钮实现到火场供水压力计算的处理类
				Intent intent = new Intent(water_power.this, water_power_fire.class);
				
				startActivity(intent);
			}
		});
		
		
		// 获取按钮
		Button btu_water_power_pump = (Button) findViewById(R.id.btu_water_power_pump);
		
		// 实现按钮的处理事件
		btu_water_power_pump.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 按下按钮跳转到建高选择的界面
				Intent intent = new Intent(water_power.this, water_power_pump.class);
				
				startActivity(intent);
			}
		});
	}
	
}
