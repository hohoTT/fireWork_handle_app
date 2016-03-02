package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

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
//				String str_area = edit_fire_area.getText().toString();
//				Log.d("fire_area", str_area);
				
				int fire_area = Integer.parseInt(edit_fire_area.getText().toString());
				
				
				
			}
		});
		
	}
	
}
