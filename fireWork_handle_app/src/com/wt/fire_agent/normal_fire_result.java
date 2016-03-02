package com.wt.fire_agent;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

// 一般火灾中计算水剂的结果类，即呈现计算水剂的结果
public class normal_fire_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_fire_result);
		
		// 获取normal_fire处理类中传入的数值
		Intent intent = getIntent();
		
		// 以下为测试时使用
//		double fire_area = 	intent.getDoubleExtra("fire_area", 0);
//		
//		String str_fire_area = Double.toString(fire_area);
//		
//		Log.d("fire_area_hoho", "accept mag : " + str_fire_area);
		
		// 获取每秒用水量的数值
		double water_result = intent.getDoubleExtra("water_result", 0);
		// 以下为将water_result的数值保留两位小数
		DecimalFormat df_water_result = new DecimalFormat("######0.00");
		
		// 将每秒用水量的数值传入到界面中text_water_result的TextView中，设置其内容
		TextView text_water_result = (TextView) findViewById(R.id.text_water_result);
		text_water_result.setText(df_water_result.format(water_result) + " L");
		
		// 获取10吨消防车可持续灭火的时间
		double fire_time = intent.getDoubleExtra("fire_time", 0);
		// 以下为将10吨消防车可持续灭火的时间的数值保留两位小数
		DecimalFormat df_fire_time = new DecimalFormat("######0.00");
		
		// 将每秒用水量的数值传入到界面中text_fire_time_result的TextView中，设置其内容
		TextView text_fire_time_result = (TextView) findViewById(R.id.text_fire_time_result);
		text_fire_time_result.setText(df_fire_time.format(fire_time) + " s");
		
	}
	
}
