package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class oilcan_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.oilcan_fire);
		
		// ��ȴ��ˮ���Ĵ���
		Button btu_olican_fire_water = (Button) findViewById(R.id.btu_olican_fire_water);
		
		// ��ȴ��ˮ�����¼�����
		btu_olican_fire_water.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ�ֵ���ȴ��ˮ���������ҳ��
				Intent intent = new Intent(oilcan_fire.this, olican_fire_water.class);
				startActivity(intent);
			}
		});
		
	}
	
}