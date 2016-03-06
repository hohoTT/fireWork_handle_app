package com.wt.water_power;

import java.text.DecimalFormat;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// �����߶���50�����ϵĽ����ʾ��
public class water_power_pump_high_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.water_power_pump_high_result);
		
		// ��ȡ���ݵļ�����ֵ
		Intent intent = getIntent();
		
		// ��ȡ����Ĺ�ˮѹ��
		double water_power_pump_high_results = intent.getDoubleExtra("water_power_pump_high_results", 0);

		// �������ڽ���ֵ������λС��
		DecimalFormat df = new DecimalFormat("######0.00");
		
		// ��ȡ�����е�water_power_pump_high_height_result���ԣ�����Ϊ����д����Ĺ�ˮѹ����
		TextView text_water_power_pump_high_height_result = (TextView) findViewById(R.id.water_power_pump_high_height_result);
		
		text_water_power_pump_high_height_result.setText(df.format(water_power_pump_high_results));
				
	}
	
}
