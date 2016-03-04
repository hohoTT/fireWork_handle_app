package com.wt.fire_agent;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

//�����͹޻����������ĭ�����Ľ����ʾ
public class oilcan_fire_foam_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.olican_fire_foam_result);
		
		// ��ȡoilcan_fire_foam�д�������ֵ
		Intent intent = getIntent();
		
		// ��ȡoilcan_fire_foam�м������ˮ��
		double olican_fire_foam_water_result = intent.getDoubleExtra("olican_fire_foam_water_result", 0);
		
		// ��ȡoilcan_fire_foam�м������ĭ����
		double olican_fire_foam_stoste_result = intent.getDoubleExtra("olican_fire_foam_stoste_result", 0);
		
		// ����DecimalFormat��ʵ�����Ľ��������λС��
		DecimalFormat df = new DecimalFormat("######0.00");
	
		// �������������ˮ����ֵ��ʾ���ֻ�������
		TextView text_oilcan_fire_foam_water_result = (TextView) findViewById(R.id.text_oilcan_fire_foam_water_result);
		text_oilcan_fire_foam_water_result.setText(df.format(olican_fire_foam_water_result) + " L");
		
		// �������������ˮ����ֵ��ʾ���ֻ�������
		TextView text_oilcan_fire_form_stoste_result = (TextView) findViewById(R.id.text_oilcan_fire_form_stoste_result);
		text_oilcan_fire_form_stoste_result.setText(df.format(olican_fire_foam_stoste_result) + " L");
	}
	
}