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

// �������ִ�����
public class water_power_fire_building extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.water_power_fire_building);

		// �ύ��ťʵ�ֽ�����������д��ݲ����м���
		Button btu_water_power_fire_building = (Button) findViewById(R.id.btu_water_power_fire_building);

		// �ύ��ť�Ĵ����¼�
		btu_water_power_fire_building.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				// ��ȡһ������֧�ߵ�����
				EditText edit_water_power_fire_building_count_feeder = (EditText) findViewById(R.id.water_power_fire_building_count_feeder);

				// ����ȡһ������֧�ߵ�����ת��Ϊ�ַ�������ʽ
				String str_water_power_fire_building_count_feeder = edit_water_power_fire_building_count_feeder
						.getText().toString();

				// ��ȡһ������ˮ������
				EditText edit_water_power_fire_building_count_groundline_band = (EditText) findViewById(R.id.water_power_fire_building_count_groundline_band);

				// ����ȡһ������ˮ������ת��Ϊ�ַ�������ʽ
				String str_water_power_fire_building_count_groundline_band = edit_water_power_fire_building_count_groundline_band
						.getText().toString();

				// ��ȡһ��֧��ˮ������
				EditText edit_water_power_fire_building_count_feeder_band = (EditText) findViewById(R.id.water_power_fire_building_count_feeder_band);

				// ����ȡһ��֧��ˮ������ת��Ϊ�ַ�������ʽ
				String str_water_power_fire_building_count_feeder_band = edit_water_power_fire_building_count_feeder_band
						.getText().toString();

				// ��ȡ�߶Ȳ�
				EditText edit_water_power_fire_building_height = (EditText) findViewById(R.id.water_power_fire_building_height);

				// ����ȡ�ĸ߶Ȳ�ת��Ϊ�ַ�������ʽ
				String str_water_power_fire_building_height = edit_water_power_fire_building_height
						.getText().toString();

				// ����û�û������һ������֧�ߵ������Ͱ��°�ť������ʾ�û�����һ������֧�ߵ�����
				if ("".equals(str_water_power_fire_building_count_feeder)) {
					Toast.makeText(water_power_fire_building.this,
							"һ������֧�ߵ���������Ϊ��", Toast.LENGTH_SHORT).show();
				}
				// ����û�û������һ������ˮ�������Ͱ��°�ť������ʾ�û�����һ������֧�ߵ�����
				else if (""
						.equals(str_water_power_fire_building_count_groundline_band)) {
					Toast.makeText(water_power_fire_building.this,
							"һ������ˮ����������Ϊ��", Toast.LENGTH_SHORT).show();
				}
				// ����û�û������һ��֧��ˮ�������Ͱ��°�ť������ʾ�û�����һ������֧�ߵ�����
				else if (""
						.equals(str_water_power_fire_building_count_feeder_band)) {
					Toast.makeText(water_power_fire_building.this,
							"һ��֧��ˮ����������Ϊ��", Toast.LENGTH_SHORT).show();
				}
				// ����û�û������߶Ȳ�Ͱ��°�ť������ʾ�û�����߶Ȳ�
				else if ("".equals("str_water_power_fire_building_height")) {
					Toast.makeText(water_power_fire_building.this, "�߶Ȳ��Ϊ��",
							Toast.LENGTH_SHORT).show();
				}
				// ���û��������Ч����ֵת����double���͵���ֵ
				else {
					try {
						// ���ߵ�֧������
						double water_power_fire_building_count_feeder = Double
								.valueOf(str_water_power_fire_building_count_feeder);

						// ����ˮ������
						double water_power_fire_building_count_groundline_band = Double
								.valueOf(str_water_power_fire_building_count_groundline_band);

						// ֧��ˮ������
						double water_power_fire_building_count_feeder_band = Double
								.valueOf(str_water_power_fire_building_count_feeder_band);

						// �߶Ȳ�
						double water_power_fire_building_height = Double
								.valueOf(str_water_power_fire_building_height);

						// ����Ϊ 65mm ˮ������Ĺ���
						double x = 0.035 * 6.5 * 6.5 * water_power_fire_building_count_feeder_band;

						double y = 0.035
								* (6.5 * water_power_fire_building_count_feeder)
								* (6.5 * water_power_fire_building_count_feeder)
								* water_power_fire_building_count_groundline_band;

						double water_power_fire_building_65_result = x + y
								+ water_power_fire_building_count_feeder * 0.27
								+ water_power_fire_building_height;
						
						// ����Ϊ 80mm ˮ������Ĺ���
						double x1 = 0.015 * 6.5 * 6.5 * water_power_fire_building_count_feeder_band;

						double y1 = 0.015
								* (6.5 * water_power_fire_building_count_feeder)
								* (6.5 * water_power_fire_building_count_feeder)
								* water_power_fire_building_count_groundline_band;

						double water_power_fire_building_80_result = x1 + y1
								+ water_power_fire_building_count_feeder * 0.355
								+ water_power_fire_building_height;
						
						// ���������ֵ���д���
						Intent intent = new Intent(water_power_fire_building.this, water_power_fire_building_result.class);
						
						intent.putExtra("water_power_fire_building_65_result", water_power_fire_building_65_result);
						intent.putExtra("water_power_fire_building_80_result", water_power_fire_building_80_result);

					} catch (Exception e) {
						// TODO: handle exception
						// ��ȡ��Ϊ�������͵��쳣����Toast����ʽ�׳����û���ʾ��Ϣ
						Toast.makeText(water_power_fire_building.this,
								"��������ֻ��������", Toast.LENGTH_SHORT).show();
					}
				}
			}
		});
	}

}