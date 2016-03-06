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
        // ȥ��������
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.fire_agent);
		
		// һ����ּ���
		Button btu_normal_fire = (Button) findViewById(R.id.btu_normal_fire);
		
		// һ����ּ���Ĵ����¼�
		btu_normal_fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ��ҳ�����ת
				Intent intent = new Intent(fire_agent.this, normal_fire.class);
				startActivity(intent);
				
			}
		});
		
		
		// �͹޻�������µļ���
		Button btu_oilcan_fire = (Button) findViewById(R.id.btu_oilcan_fire);
		
		// ���ð�ť��͸����
        btu_oilcan_fire.getBackground().setAlpha(100);
		
        // �͹޻�������µĴ����¼�
		btu_oilcan_fire.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ʵ�ֵ��͹޻���ѡ������Ŀҳ�����ת
				Intent intent = new Intent(fire_agent.this, oilcan_fire.class);
				startActivity(intent);
				
			}
		});
		
	}
	
}
