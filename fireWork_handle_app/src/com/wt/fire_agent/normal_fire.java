package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class normal_fire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_fire_water);
		
		// �ύ��ťʵ�ֽ�����������д���
		Button btu_normal_fire_send = (Button) findViewById(R.id.btu_normal_fire_send);
		
		// �ύ��ť�Ĵ����¼�
		btu_normal_fire_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				
				// ��ô���Ĺ����������ֵ
				EditText edit_fire_area = (EditText) findViewById(R.id.fire_area);
				
				// ����Ϊ���Ի�ȡ��������������ֵ
//				String str_area = edit_fire_area.getText().toString();
//				Log.d("fire_area", str_area);
				
				int fire_area = Integer.parseInt(edit_fire_area.getText().toString());
				
				
				
			}
		});
		
	}
	
}