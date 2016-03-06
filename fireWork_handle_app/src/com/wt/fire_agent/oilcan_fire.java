package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class oilcan_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.oilcan_fire);
		
		// 冷却用水量的处理
		Button btu_olican_fire_water = (Button) findViewById(R.id.btu_olican_fire_water);
		
		// 冷却用水量的事件处理
		btu_olican_fire_water.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现到冷却用水量处理类的页面
				Intent intent = new Intent(oilcan_fire.this, olican_fire_water.class);
				startActivity(intent);
			}
		});
		
		// 泡沫用量计算的处理
		Button btu_olican_fire_foam = (Button) findViewById(R.id.btu_olican_fire_foam);

        // 设置按钮的透明度
        btu_olican_fire_foam.getBackground().setAlpha(100);
        
		// 泡沫用量计算的时间处理
		btu_olican_fire_foam.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 实现到泡沫用量计算处理类的跳转
				Intent intent = new Intent(oilcan_fire.this, olican_fire_foam.class);
				startActivity(intent);
			}
		});
	}
	
}
