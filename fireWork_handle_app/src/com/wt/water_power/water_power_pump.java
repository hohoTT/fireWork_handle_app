package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class water_power_pump extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.water_power_pump);
		
		// �������µ�������ť�Խ�Ҫ����Ĺ�ˮѹ�����н��ߵ�ѡ��
		
		// 50�����µĽ��߰�ť
		Button btu_water_power_pump_low = (Button) findViewById(R.id.btu_water_power_pump_low);
		
		// ʵ�ְ�ť�Ĵ����¼�
		btu_water_power_pump_low.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				// ��ת������Ϊ50�����µĴ�����
				Intent intent = new Intent(water_power_pump.this, water_power_pump_low.class);
				
				startActivity(intent);
				
			}
		});
		
	}
	
}