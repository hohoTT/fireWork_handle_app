package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 油罐火灾供水压力处理类
public class water_power_fire_oilcan extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.water_power_fire_oilcan);
		
		// 提交按钮实现将最后的油罐火灾情况下的结果进行传递并进行计算
		Button btu_water_power_fire_oilcan = (Button) findViewById(R.id.btu_water_power_fire_oilcan);

		// 提交按钮的处理事件
		btu_water_power_fire_oilcan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				// 获取一条干线支线的数量
				EditText edit_water_power_fire_oilcan_count_feeder = (EditText) findViewById(R.id.water_power_fire_oilcan_count_feeder);

				// 将获取一条干线支线的数量转化为字符串的形式
				String str_water_power_fire_oilcan_count_feeder = edit_water_power_fire_oilcan_count_feeder
						.getText().toString();

				// 获取一条干线水带数量
				EditText edit_water_power_fire_oilcan_count_groundline_band = (EditText) findViewById(R.id.water_power_fire_oilcan_count_groundline_band);

				// 将获取一条干线水带数量转化为字符串的形式
				String str_water_power_fire_oilcan_count_groundline_band = edit_water_power_fire_oilcan_count_groundline_band
						.getText().toString();

				// 获取一条支线水带数量
				EditText edit_water_power_fire_oilcan_count_feeder_band = (EditText) findViewById(R.id.water_power_fire_oilcan_count_feeder_band);

				// 将获取一条支线水带数量转化为字符串的形式
				String str_water_power_fire_oilcan_count_feeder_band = edit_water_power_fire_oilcan_count_feeder_band
						.getText().toString();

				// 获取高度差
				EditText edit_water_power_fire_oilcan_height = (EditText) findViewById(R.id.water_power_fire_oilcan_height);

				// 将获取的高度差转化为字符串的形式
				String str_water_power_fire_oilcan_height = edit_water_power_fire_oilcan_height
						.getText().toString();
				
				
				// 如果用户没有输入一条干线支线的数量就按下按钮，则提示用户输入一条干线支线的数量
				if ("".equals(str_water_power_fire_oilcan_count_feeder)) {
					Toast.makeText(water_power_fire_oilcan.this,
							"一条干线支线的数量不可为空", Toast.LENGTH_SHORT).show();
				}
				// 如果用户没有输入一条干线水带数量就按下按钮，则提示用户输入一条干线支线的数量
				else if (""
						.equals(str_water_power_fire_oilcan_count_groundline_band)) {
					Toast.makeText(water_power_fire_oilcan.this,
							"一条干线水带数量不可为空", Toast.LENGTH_SHORT).show();
				}
				// 如果用户没有输入一条支线水带数量就按下按钮，则提示用户输入一条干线支线的数量
				else if (""
						.equals(str_water_power_fire_oilcan_count_feeder_band)) {
					Toast.makeText(water_power_fire_oilcan.this,
							"一条支线水带数量不可为空", Toast.LENGTH_SHORT).show();
				}
				// 如果用户没有输入高度差就按下按钮，则提示用户输入高度差
				else if ("".equals(str_water_power_fire_oilcan_height)) {
					Toast.makeText(water_power_fire_oilcan.this, "高度差不可为空",
							Toast.LENGTH_SHORT).show();
				}
				// 将用户输入的有效的数值转换成double类型的数值
				else {
					try {
						// 干线的支线数量
						double water_power_fire_oilcan_count_feeder = Double
								.valueOf(str_water_power_fire_oilcan_count_feeder);

						// 干线水带数量
						double water_power_fire_oilcan_count_groundline_band = Double
								.valueOf(str_water_power_fire_oilcan_count_groundline_band);

						// 支线水带数量
						double water_power_fire_oilcan_count_feeder_band = Double
								.valueOf(str_water_power_fire_oilcan_count_feeder_band);

						// 高度差
						double water_power_fire_oilcan_height = Double
								.valueOf(str_water_power_fire_oilcan_height);

						// 以下为 65mm 水带计算的过程
						double x = 0.035 * 7.5 * 7.5 * water_power_fire_oilcan_count_feeder_band;

						double y = 0.035
								* (7.5 * water_power_fire_oilcan_count_feeder)
								* (7.5 * water_power_fire_oilcan_count_feeder)
								* water_power_fire_oilcan_count_groundline_band;

						double water_power_fire_oilcan_65_result = x + y
								+ water_power_fire_oilcan_count_feeder * 0.355
								+ water_power_fire_oilcan_height;
						
						// 以下为 80mm 水带计算的过程
						double x1 = 0.015 * 6.5 * 6.5 * water_power_fire_oilcan_count_feeder_band;

						double y1 = 0.015
								* (7.5 * water_power_fire_oilcan_count_feeder)
								* (7.5 * water_power_fire_oilcan_count_feeder)
								* water_power_fire_oilcan_count_groundline_band;

						double water_power_fire_oilcan_80_result = x1 + y1
								+ water_power_fire_oilcan_count_feeder * 0.355
								+ water_power_fire_oilcan_height;
						
						// 将计算的数值进行传递
						Intent intent = new Intent(water_power_fire_oilcan.this, water_power_fire_oilcan_result.class);
						
						intent.putExtra("water_power_fire_oilcan_65_result", water_power_fire_oilcan_65_result);
						intent.putExtra("water_power_fire_oilcan_80_result", water_power_fire_oilcan_80_result);

						startActivity(intent);
						
					} catch (Exception e) {
						// TODO: handle exception
						// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
						Toast.makeText(water_power_fire_oilcan.this,
								"四个数量只能是数字", Toast.LENGTH_SHORT).show();
					}
				}
				
			}
		});
	}
	
	
}
