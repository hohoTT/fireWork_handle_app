package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 建筑高度在50米以上的计算处理类
public class water_power_pump_high extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.water_power_pump_high);

		// 获取提交按钮
		Button btu_water_power_pump_high_send = (Button) findViewById(R.id.btu_water_power_pump_high_send);

		// 实现按钮的处理事件，点击按钮进行供水压力的计算
		btu_water_power_pump_high_send
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub

						// 获取界面中用户输入的建筑高度
						EditText edit_water_power_pump_high_height = (EditText) findViewById(R.id.water_power_pump_high_height);

						// 将获得的建筑高度转化为字符串的形式
						String str_water_power_pump_high_height = edit_water_power_pump_high_height
								.getText().toString();

						// 如果用户没有输入建筑高度就按下按钮，则提示用户输入建筑高度
						if ("".equals(str_water_power_pump_high_height)) {
							Toast.makeText(water_power_pump_high.this,
									"建筑高度不可为空", Toast.LENGTH_SHORT).show();
						}
						// 将用户输入的有效的数值转换成double类型的数值
						else {
							try {
								// 将建筑高度的数值转化为double
								double water_power_pump_high = Double
										.valueOf(str_water_power_pump_high_height);
								
								// 以下为测试时使用
								Log.d("high_height", "high_height + hoho " + str_water_power_pump_high_height);

								// 判断用户输入的建筑高度是否符合要求
								if (water_power_pump_high > 50) {
									// 以下为用户输入符合要求的情况
									// 进行数值的计算
									double x = water_power_pump_high - 50;
									double y = 8 * x / 50;
									double water_power_pump_high_results = water_power_pump_high
											+ (8 + y) - 23.5;
									
									// 以下为测试时使用
//									String test = Double.toString(water_power_pump_high_results);
//									
//									Log.d("high_height", "high_height + high_result " + test);
									
									// 将计算得出的结果传递到界面中
									Intent intent = new Intent(water_power_pump_high.this, water_power_pump_high_result.class);
									
									intent.putExtra("water_power_pump_high_results", water_power_pump_high_results);

									startActivity(intent);
								}
								// 输入不符合要求，提示用户重新进行输入
								else {
									Toast.makeText(water_power_pump_high.this,
											"建筑高度必须大于50米，请重新输入！",
											Toast.LENGTH_SHORT).show();
								}

							} catch (Exception e) {
								// TODO: handle exception
								// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
								Toast.makeText(water_power_pump_high.this,
										"建筑高度只能是数字", Toast.LENGTH_SHORT).show();
							}
						}

					}
				});

	}

}
