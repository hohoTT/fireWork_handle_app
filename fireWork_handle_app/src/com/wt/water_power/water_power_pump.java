package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class water_power_pump extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
	
		setContentView(R.layout.water_power_pump);
		
		// 按下以下的两个按钮对将要计算的供水压力进行建高的选择
		
		// 50米以下的建高供水压力计算处理按钮
		Button btu_water_power_pump_low = (Button) findViewById(R.id.btu_water_power_pump_low);
		
		// 实现按钮的处理事件
		btu_water_power_pump_low.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				// 跳转到建高为50米以下的处理类
				Intent intent = new Intent(water_power_pump.this, water_power_pump_low.class);
				
				startActivity(intent);
			}
		});
		
		// 50米以上的建高供水压力计算处理按钮
		Button btu_water_power_pump_high = (Button) findViewById(R.id.btu_water_power_pump_high);
		
		// 实现按钮的处理事件
		btu_water_power_pump_high.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现到建筑高度50米以上的计算处理类的跳转
				Intent intent = new Intent(water_power_pump.this, water_power_pump_high.class);
				
				startActivity(intent);
			}
		});
		
	}
	
}
