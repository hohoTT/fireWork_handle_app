package com.wt.fire_agent;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//创建油罐火灾情况下泡沫用量的结果显示
public class oilcan_fire_foam_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.olican_fire_foam_result);
		
		// 获取oilcan_fire_foam中传来的数值
		Intent intent = getIntent();
		
		// 获取oilcan_fire_foam中计算的用水量
		double olican_fire_foam_water_result = intent.getDoubleExtra("olican_fire_foam_water_result", 0);
		
		// 获取oilcan_fire_foam中计算的泡沫用量
		double olican_fire_foam_stoste_result = intent.getDoubleExtra("olican_fire_foam_stoste_result", 0);
		
		// 创建DecimalFormat，实现最后的结果保留两位小数
		DecimalFormat df = new DecimalFormat("######0.00");
	
		// 将计算出来的用水量数值显示在手机界面上
		TextView text_oilcan_fire_foam_water_result = (TextView) findViewById(R.id.text_oilcan_fire_foam_water_result);
		text_oilcan_fire_foam_water_result.setText(df.format(olican_fire_foam_water_result) + " L");
		
		// 将计算出来的用水量数值显示在手机界面上
		TextView text_oilcan_fire_form_stoste_result = (TextView) findViewById(R.id.text_oilcan_fire_form_stoste_result);
		text_oilcan_fire_form_stoste_result.setText(df.format(olican_fire_foam_stoste_result) + " L");
	}
	
}
