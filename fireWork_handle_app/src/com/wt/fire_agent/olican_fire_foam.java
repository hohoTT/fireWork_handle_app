package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 泡沫用量计算处理类
public class olican_fire_foam extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.olican_fire_foam);
		
		// 提交按钮实现将过火面积进行传递并进行计算
		Button btu_olican_fire_foam_send = (Button) findViewById(R.id.btu_olican_fire_foam_send);
		
		// 提交按钮的处理事件
		btu_olican_fire_foam_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 获取油罐的燃烧面积
				EditText edit_olican_fire_foam_area = (EditText) findViewById(R.id.olican_fire_foam_area);
				
				// 将获取的油罐的燃烧面积转化为字符串的形式
				String str_olican_fire_foam_area = edit_olican_fire_foam_area.getText().toString();
				
				// 获取流量
				EditText edit_olican_fire_foam_flow = (EditText) findViewById(R.id.olican_fire_foam_flow);
				
				// 将获取流量转化为字符串的形式
				String str_olican_fire_foam_flow = edit_olican_fire_foam_flow.getText().toString();
				
				//  如果用户没有输入油罐的燃烧面积就按下按钮，则提示用户输入油罐的燃烧面积
				if("".equals(str_olican_fire_foam_area)){
					Toast.makeText(olican_fire_foam.this, "油罐的燃烧面积不可为空",
							Toast.LENGTH_SHORT).show();
				}
				else{
					
				}
				
				//  如果用户没有输入流量就按下按钮，则提示用户输入流量
				if("".equals(str_olican_fire_foam_flow)){
					Toast.makeText(olican_fire_foam.this, "流量不可为空",
							Toast.LENGTH_SHORT).show();
				}
				else{
					
				}
			}
		});
	}
	
}
