package com.wt.water_power;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// �𳡹�ˮѹ������Ĵ�����
public class water_power_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.water_power_fire);
		
		// ���°�ť����ת��������������µĴ�����
		Button btu_water_power_fire_building = (Button) findViewById(R.id.btu_water_power_fire_building);
		
		// �������ְ�ť�Ĵ����¼�
		btu_water_power_fire_building.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ����ת��������������µĴ�����
				Intent intent = new Intent(water_power_fire.this, water_power_fire_building.class);
				startActivity(intent);
			}
		});
		
		// ���°�ť����ת���͹޻�������µĴ�����
		Button btu_water_power_fire_oilcan = (Button) findViewById(R.id.btu_water_power_fire_oilcan);
		
		// �͹޻��ְ�ť�Ĵ����¼�
		btu_water_power_fire_oilcan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ����ת���͹� ��������µĴ�����
				Intent intent = new Intent(water_power_fire.this, water_power_fire_oilcan.class);
				startActivity(intent);
			}
		});
	}
	
}