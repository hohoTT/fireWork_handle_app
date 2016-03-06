package com.wt.fire_agent;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

// 创建油罐火灾情况下冷却用水的结果显示
public class olican_fire_water_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.olican_fire_water_result);
		
		// 获取olican_fire_water处理类传递的数值
		Intent intent = getIntent();
		
		// 获取每秒用水量的数值
		double olican_fire_water_result = intent.getDoubleExtra("olican_fire_water_result", 0);
		// 以下为将water_result的数值保留两位小数
		DecimalFormat df_water_result = new DecimalFormat("######0.00");
		
		// 将每秒用水量的数值传入到界面中text_water_result的TextView中，设置其内容
		TextView text_oilcan_fire_water_result = (TextView) findViewById(R.id.text_oilcan_fire_water_result);
		text_oilcan_fire_water_result.setText(df_water_result.format(olican_fire_water_result) + " L");

		
		// 获取10吨消防车可持续灭火的时间
		double olican_fire_time = intent.getDoubleExtra("olican_fire_time", 0);
		// 以下为将10吨消防车可持续灭火的时间的数值保留两位小数
		DecimalFormat df_olican_fire_time = new DecimalFormat("######0.00");
		
		// 将每秒用水量的数值传入到界面中text_fire_time_result的TextView中，设置其内容
		TextView text_oilcan_fire__time_result = (TextView) findViewById(R.id.text_oilcan_fire__time_result);
		text_oilcan_fire__time_result.setText(df_olican_fire_time.format(olican_fire_time) + " s");
	}
	
}
