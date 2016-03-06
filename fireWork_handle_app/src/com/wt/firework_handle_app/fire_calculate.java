package com.wt.firework_handle_app;

import com.wt.fire_agent.fire_agent;
import com.wt.firework_handle_app.R;
import com.wt.water_power.water_power;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

// 火灾现场计算类
public class fire_calculate extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.fire_calculate);
        
        // 火灾剂用量的处理
        Button btu_fire_agent = (Button) findViewById(R.id.btu_fire_agent);
        
        // 火灾剂用量计算处理事件
        btu_fire_agent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现页面的跳转
				Intent intent = new Intent(fire_calculate.this, fire_agent.class);
				startActivity(intent);
			}
		});
        
        // 供水压力计算的处理
        Button btu_water_power = (Button) findViewById(R.id.btu_water_power);

        // 设置按钮的透明度
        btu_water_power.getBackground().setAlpha(100);
        
        // 供水压力计算的处理事件
        btu_water_power.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现页面的跳转
				Intent intent = new Intent(fire_calculate.this, water_power.class);
				startActivity(intent);
			}
		});
        
	}
	
}
