package com.wt.water_power;

import com.example.firework_handle_app.R;
import com.wt.fire_agent.normal_fire;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// ����С��50�׵Ĺ�ˮѹ�����㴦����
public class water_power_pump_low extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.water_power_pump_low);
		
		// ��ȡ�ύ��ť
		Button btu_water_power_pump_low_send = (Button) findViewById(R.id.btu_water_power_pump_low_send);
		
		// ʵ���ύ��ť�Ĵ����¼�
		btu_water_power_pump_low_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				// ��ȡ�����߶�(С��50��)����ֵ
				EditText edid_water_power_pump_low_height = (EditText) findViewById(R.id.water_power_pump_low_height);
				
				// ����ȡ�ĸ߶���ֵת��Ϊ�ַ���������
				String str_water_power_pump_low_height = edid_water_power_pump_low_height.getText().toString();
				
				// ����û�û�����뽨���߶ȾͰ��°�ť������ʾ�û����뽨���߶�
				if("".equals(str_water_power_pump_low_height)){
					Toast.makeText(water_power_pump_low.this, "�����߶Ȳ���Ϊ��",
							Toast.LENGTH_SHORT).show();
				}
				// ���û��������Ч�Ľ����߶�ת����double���͵���ֵ
				else{
					// ��ȡ��Ч�Ĺ��������ת����double���͵���ֵ
					try {
						
						// �����߶�
						double water_power_pump_low_height = Double.valueOf(str_water_power_pump_low_height);
						
						// �ж��û�����Ľ����߶��Ƿ����Ҫ���Ƿ�����߶���50����������
						if(water_power_pump_low_height <= 50){
							// ����Ϊ�û��������Ҫ������
							// ������ֵ�ļ���
							double water_power_pump_low_height_result = water_power_pump_low_height + 8 + 27.5;
							
							// ������ó��Ľ�����д��䣬���ݵ������ʾ�Ĵ�����
							Intent intent = new Intent(water_power_pump_low.this, water_power_pump_low_result.class);
							
							intent.putExtra("water_power_pump_low_height_result", water_power_pump_low_height_result);
							
							startActivity(intent);
							
						}
						// ����Ϊ�߶ȴ���50�׵��������ʾ�û����½�������
						else{
							Toast.makeText(water_power_pump_low.this, "����Ľ����߶Ȳ��ɳ���50�ף����������룡",
									Toast.LENGTH_SHORT).show();
						}
						
						
					} catch (Exception e) {
						// TODO: handle exception
						// ��ȡ��Ϊ�������͵��쳣����Toast����ʽ�׳����û���ʾ��Ϣ
						Toast.makeText(water_power_pump_low.this, "����Ľ����߶�ֻ��������",
								Toast.LENGTH_SHORT).show();
					}
				}
				
				
			}
		});
		
		
		
		
	}
	
}