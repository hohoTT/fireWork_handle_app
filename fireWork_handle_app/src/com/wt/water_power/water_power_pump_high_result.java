package com.wt.water_power;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// 建筑高度在50米以上的结果显示类
public class water_power_pump_high_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.water_power_pump_high_result);
		
		// 获取传递的计算数值
		Intent intent = getIntent();
		
		// 获取计算的供水压力
		double water_power_pump_high_results = intent.getDoubleExtra("water_power_pump_high_results", 0);

		// 以下用于将数值保留两位小数
		DecimalFormat df = new DecimalFormat("######0.00");
		
		// 获取界面中的water_power_pump_high_height_result属性，用于为其填写计算的供水压力的
		TextView text_water_power_pump_high_height_result = (TextView) findViewById(R.id.water_power_pump_high_height_result);
		
		text_water_power_pump_high_height_result.setText(df.format(water_power_pump_high_results));
				
	}
	
}
