package com.wt.fire_agent;

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

// 一般火灾中计算水剂的获取以及处理类
public class normal_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_fire_water);

		// 提交按钮实现将过火面积进行传递
		Button btu_normal_fire_send = (Button) findViewById(R.id.btu_normal_fire_send);

		// 提交按钮的处理事件
		btu_normal_fire_send.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub

				// 获得传入的过火面积的数值
				EditText edit_fire_area = (EditText) findViewById(R.id.fire_area);

				// 以下为测试获取传入过火面积的数值
				String str_area = edit_fire_area.getText().toString();
				// Log.d("fire_area", str_area);

				// 如果用户没有输入过火面积就按下按钮，则提示用户输入过火面积
				if ("".equals(str_area)) {
					Toast.makeText(normal_fire.this, "过火面积不可为空",
							Toast.LENGTH_SHORT).show();
				} 
				// 将用户输入的有效的过火面积转换成double类型的数值
				else {
					// 获取有效的过火面积并转换成double类型的数值
					try {
						double fire_area = Double.valueOf(str_area);
						
						// 显式传递运算的结果
						Intent intent = new Intent(normal_fire.this, normal_fire_result.class);
						intent.putExtra("fire_area", fire_area);
						startActivity(intent);
						
//						 Log.d("fire_area", str_area);
					} catch (Exception e) {
						// TODO: handle exception
						// 获取不为数字类型的异常，以Toast的形式抛出给用户提示信息
						Toast.makeText(normal_fire.this, "输入的过火面积只能是数字",
								Toast.LENGTH_SHORT).show();
					}
					
				}

			}
		});

	}

}
