package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// ��ĭ�������㴦����
public class olican_fire_foam extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.olican_fire_foam);
		
		// �ύ��ťʵ�ֽ�����������д��ݲ����м���
		Button btu_olican_fire_foam_send = (Button) findViewById(R.id.btu_olican_fire_foam_send);
		
		// �ύ��ť�Ĵ����¼�
		btu_olican_fire_foam_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// ��ȡ�͹޵�ȼ�����
				EditText edit_olican_fire_foam_area = (EditText) findViewById(R.id.olican_fire_foam_area);
				
				// ����ȡ���͹޵�ȼ�����ת��Ϊ�ַ�������ʽ
				String str_olican_fire_foam_area = edit_olican_fire_foam_area.getText().toString();
				
				// ��ȡ����
				EditText edit_olican_fire_foam_flow = (EditText) findViewById(R.id.olican_fire_foam_flow);
				
				// ����ȡ����ת��Ϊ�ַ�������ʽ
				String str_olican_fire_foam_flow = edit_olican_fire_foam_flow.getText().toString();
				
				//  ����û�û�������͹޵�ȼ������Ͱ��°�ť������ʾ�û������͹޵�ȼ�����
				if("".equals(str_olican_fire_foam_area)){
					Toast.makeText(olican_fire_foam.this, "�͹޵�ȼ���������Ϊ��",
							Toast.LENGTH_SHORT).show();
				}
				//  ����û�û�����������Ͱ��°�ť������ʾ�û���������
				else if("".equals(str_olican_fire_foam_flow)){
					Toast.makeText(olican_fire_foam.this, "��������Ϊ��",
							Toast.LENGTH_SHORT).show();
				}
				// ���û��������Ч���͹޵�ȼ������Լ�����ת����double���͵���ֵ
				else{
					// ��ȡ��Ч���͹޵�ȼ������Լ�������ת����double���͵���ֵ
					double olican_fire_foam_area = Double.valueOf(str_olican_fire_foam_area);

					// ��ȡ��Ч��������ת����double���͵���ֵ
					double olican_fire_foam_flow = Double.valueOf(str_olican_fire_foam_flow);
					
					// ������͹޻��ֵ���ˮ��
					double olican_fire_foam_water_result = olican_fire_foam_area * 0.94;
					
					// ������͹޻��ֵ���ĭԭҺ����
					double olican_fire_foam_stoste_result = olican_fire_foam_area * 0.06;
					
					// ��ʽ�Ĵ��ݼ������ֵ
					Intent intent = new Intent(olican_fire_foam.this, oilcan_fire_foam_result.class);
					// ���ݼ���ĸ��͹޻��ֵ���ˮ��
					intent.putExtra("olican_fire_foam_water_result", olican_fire_foam_water_result);
					
					// ���ݼ���ĸ��͹޻��ֵ���ĭԭҺ����
					intent.putExtra("olican_fire_foam_stoste_result", olican_fire_foam_stoste_result);
					startActivity(intent);
				}
			}
		});
	}
	
}