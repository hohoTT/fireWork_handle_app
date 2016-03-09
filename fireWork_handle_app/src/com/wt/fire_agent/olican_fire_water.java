package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;	
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

// 创建油罐火灾情况下冷却用水的结果处理类
public class olican_fire_water extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.olican_fire_water);
		
		// 用radioGroup来判断用户选择的油罐类型
		RadioGroup olican_type = (RadioGroup) findViewById(R.id.olican_type);
		
		// 为radioGroup添加监听事件，用来监听组件内部的事件响应
		olican_type.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				// 在这个函数里面用来改变选择的radioButton的数值，以及与其值相关的任何操作
				
			}
		});
		
	
		// 提交按钮实现油罐火灾情况下冷却用水量的传递以及计算
		Button btu_olican_fire_water_send = (Button) findViewById(R.id.btu_olican_fire_water_send);
		
		// 提交按钮实现油罐火灾情况下冷却用水量的传递以及计算的处理事件
		btu_olican_fire_water_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 获取界面中用户选择的油罐直径的数值
				EditText edit_olican_diameter = (EditText) findViewById(R.id.olican_diameter);
				
				String str_olican_diameter = edit_olican_diameter.getText().toString();
				
				// 对获取到的字符串进行判断并计算的处理
				// 如果得到的为空，即用户没有在文本框中进行输入，则使用Toast提示用户进行输入
				if("".equals(str_olican_diameter)){
					Toast.makeText(olican_fire_water.this, "油罐直径不可为空",
							Toast.LENGTH_SHORT).show();
				}
				else{
					// 获取有效的油罐直径并转换成double类型的数值
					try {
						// 油罐直径
						double olican_diameter = Double.valueOf(str_olican_diameter);
						
						// 获取用户选择的油罐类型
						RadioGroup radioGroup_olican_type = (RadioGroup) findViewById(R.id.olican_type);
						RadioButton radioButton = (RadioButton) findViewById(radioGroup_olican_type.getCheckedRadioButtonId());
						
						int olican_type = radioGroup_olican_type.getCheckedRadioButtonId();

						// 测试olican_type的ID时使用
//						Toast.makeText(olican_fire_water.this, "类型ID为:" + olican_type,
//								Toast.LENGTH_SHORT).show();
						
						// 以下的计算根据用户选择的油罐类型进行计算
						// olican_type为 1 时为固定顶油罐
						// olican_type为 2 时 为浮顶油罐
						
						// 如果是固定顶油罐的情况
						if(olican_type == 1){
							// 油罐周长
							double c = 3.14 * olican_diameter;
							// 冷却枪支的数量(使用强制转换的形式，将double类型转化为int类型)
							double x = c / 9.375;
							
							// 计算得出每秒用水量的数值
							double olican_fire_water_result = x * 7.5;
							
							// 计算10吨消防车可持续灭火的时间
							double olican_fire_time = 10000 / olican_fire_water_result;
							
							// 显式传递运算的结果
							Intent intent = new Intent(olican_fire_water.this, olican_fire_water_result.class);
							
							// 传递每秒用水量的数值
							intent.putExtra("olican_fire_water_result", olican_fire_water_result);
							// 传递10吨消防车可持续灭火的时间
							intent.putExtra("olican_fire_time", olican_fire_time);

							startActivity(intent);
							
						}
						// 如果是浮顶油罐的情况
						else if(olican_type == 2){
							// 油罐周长
							double c = 3.14 * olican_diameter;
							// 冷却枪支的数量(使用强制转换的形式，将double类型转化为int类型)
							double x = c / 12.5;
							
							// 计算得出每秒用水量的数值
							double olican_fire_water_result = x * 7.5;
							
							// 计算10吨消防车可持续灭火的时间
							double olican_fire_time = 10000 / olican_fire_water_result;
							
							// 显式传递运算的结果
							Intent intent = new Intent(olican_fire_water.this, olican_fire_water_result.class);
							
							// 传递每秒用水量的数值
							intent.putExtra("olican_fire_water_result", olican_fire_water_result);
							// 传递10吨消防车可持续灭火的时间
							intent.putExtra("olican_fire_time", olican_fire_time);

							startActivity(intent);
						}
						else{
							// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
							Toast.makeText(olican_fire_water.this, "油罐的类型不可为空！",
									Toast.LENGTH_SHORT).show();
						}
						
					} catch (Exception e) {
						// TODO: handle exception
						// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
						Toast.makeText(olican_fire_water.this, "输入的油罐直径只能是数字",
								Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
		
	}
	
}
