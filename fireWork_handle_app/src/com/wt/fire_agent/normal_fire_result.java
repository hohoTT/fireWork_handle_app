package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// һ������м���ˮ���Ľ���࣬�����ּ���ˮ���Ľ��
public class normal_fire_result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal_fire_result);
		
		// ��ȡnormal_fire�������д������ֵ
		Intent intent = getIntent();
		
		double fire_area = 	intent.getDoubleExtra("fire_area", 0);
		
		String str_fire_area = Double.toString(fire_area);
		
		Log.d("fire_area_hoho", "accept mag : " + str_fire_area);
	}
	
}