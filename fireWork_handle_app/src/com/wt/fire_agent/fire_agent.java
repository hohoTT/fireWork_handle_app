package com.wt.fire_agent;

import com.wt.firework_handle_app.R;
import com.wt.firework_handle_app.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class fire_agent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fire_agent);
		
		// 一般火灾计算
		Button btu_normal_fire = (Button) findViewById(R.id.btu_normal_fire);
		
		// 一般火灾计算的处理事件
		btu_normal_fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现页面的跳转
				Intent intent = new Intent(fire_agent.this, normal_fire.class);
				startActivity(intent);
				
			}
		});
		
		
		// 油罐火灾情况下的计算
		Button btu_oilcan_fire = (Button) findViewById(R.id.btu_oilcan_fire);
		
		// 设置按钮的透明度
        btu_oilcan_fire.getBackground().setAlpha(100);
		
        // 油罐火灾情况下的处理事件
		btu_oilcan_fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现到油罐火灾选择处理项目页面的跳转
				Intent intent = new Intent(fire_agent.this, oilcan_fire.class);
				startActivity(intent);
				
			}
		});
		
	}
	
}
