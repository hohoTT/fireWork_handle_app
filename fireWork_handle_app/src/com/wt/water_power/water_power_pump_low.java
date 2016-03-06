package com.wt.water_power;

import com.example.firework_handle_app.R;
import com.wt.fire_agent.normal_fire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 建高小于50米的供水压力计算处理类
public class water_power_pump_low extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.water_power_pump_low);
		
		// 获取提交按钮
		Button btu_water_power_pump_low_send = (Button) findViewById(R.id.btu_water_power_pump_low_send);
		
		// 实现提交按钮的处理事件
		btu_water_power_pump_low_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				// 获取建筑高度(小于50米)的数值
				EditText edid_water_power_pump_low_height = (EditText) findViewById(R.id.water_power_pump_low_height);
				
				// 将获取的高度数值转化为字符串的类型
				String str_water_power_pump_low_height = edid_water_power_pump_low_height.getText().toString();
				
				// 如果用户没有输入建筑高度就按下按钮，则提示用户输入建筑高度
				if("".equals(str_water_power_pump_low_height)){
					Toast.makeText(water_power_pump_low.this, "建筑高度不可为空",
							Toast.LENGTH_SHORT).show();
				}
				// 将用户输入的有效的建筑高度转换成double类型的数值
				else{
					// 获取有效的过火面积并转换成double类型的数值
					try {
						
						// 建筑高度
						double water_power_pump_low_height = Double.valueOf(str_water_power_pump_low_height);
						
						// 判断用户输入的建筑高度是否符合要求，是否满足高度在50米以下条件
						if(water_power_pump_low_height <= 50 && water_power_pump_low_height > 0){
							// 以下为用户输入符合要求的情况
							// 进行数值的计算
							double water_power_pump_low_height_result = water_power_pump_low_height + 8 + 27.5;
							
							// 将计算得出的结果进行传输，传递到结果显示的处理类
							Intent intent = new Intent(water_power_pump_low.this, water_power_pump_low_result.class);
							
							intent.putExtra("water_power_pump_low_height_result", water_power_pump_low_height_result);
							
							startActivity(intent);
							
						}
						// 以下为高度大于50米的情况，提示用户重新进行输入
						else{
							Toast.makeText(water_power_pump_low.this, "输入的建筑高度为0到50的数字，请重新输入！",
									Toast.LENGTH_SHORT).show();
						}
						
						
					} catch (Exception e) {
						// TODO: handle exception
						// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
						Toast.makeText(water_power_pump_low.this, "输入的建筑高度只能是数字",
								Toast.LENGTH_SHORT).show();
					}
				}
				
				
			}
		});
		
		
		
		
	}
	
}
