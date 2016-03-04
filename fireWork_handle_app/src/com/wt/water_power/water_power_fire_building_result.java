package com.wt.water_power;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class water_power_fire_building_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.water_power_fire_building_result);
		
		// ��ȡwater_power_fire_building�������д������ֵ
		Intent intent = getIntent();
		
		// ��ȡ65mmˮ���������ֵĹ�ˮѹ��
		double water_power_fire_building_65_result = intent.getDoubleExtra("water_power_fire_building_65_result", 0);
	
		// ��ȡ80mmˮ���������ֵĹ�ˮѹ��
		double water_power_fire_building_80_result = intent.getDoubleExtra("water_power_fire_building_80_result", 0);
	
		// �������ڽ���ֵ������λС��
		DecimalFormat df = new DecimalFormat("######0.00");
		
		// ��65mmˮ���������ֵĹ�ˮѹ������ֵ���뵽������text_water_power_fire_building_65_result��TextView�У�����������
		TextView text_water_power_fire_building_65_result = (TextView) findViewById(R.id.text_water_power_fire_building_65_result);
		text_water_power_fire_building_65_result.setText(df.format(water_power_fire_building_65_result));
		
		// ��65mmˮ���������ֵĹ�ˮѹ������ֵ���뵽������text_water_power_fire_building_65_result��TextView�У�����������
		TextView text_water_power_fire_building_80_result = (TextView) findViewById(R.id.text_water_power_fire_building_80_result);
		text_water_power_fire_building_80_result.setText(df.format(water_power_fire_building_80_result));
				
	}
	
}