package com.wt.firework_handle_app;

import com.wt.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

// �����ֳ�������
public class fire_calculate extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.fire_calculate);
        
        // ���ּ������Ĵ���
        Button btu_fire_agent = (Button) findViewById(R.id.btu_fire_agent);
        
        // ���ּ��������㴦���¼�
        btu_fire_agent.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ��ҳ�����ת
				Intent intent = new Intent(fire_calculate.this, fire_agent.class);
				startActivity(intent);
			}
		});
        
        // ��ˮѹ������Ĵ���
        Button btu_water_power = (Button) findViewById(R.id.btu_water_power);
        
        // ��ˮѹ������Ĵ����¼�
        btu_water_power.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ��ҳ�����ת
				
				
			}
		});
        
	}
	
}