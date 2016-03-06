package com.wt.fire_agent;

import com.example.firework_handle_app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// 泡沫用量计算处理类
public class olican_fire_foam extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        // 去除标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.olican_fire_foam);
		
		// 提交按钮实现将过火面积进行传递并进行计算
		Button btu_olican_fire_foam_send = (Button) findViewById(R.id.btu_olican_fire_foam_send);
		
		// 提交按钮的处理事件
		btu_olican_fire_foam_send.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// 获取油罐的燃烧面积
				EditText edit_olican_fire_foam_area = (EditText) findViewById(R.id.olican_fire_foam_area);
				
				// 将获取的油罐的燃烧面积转化为字符串的形式
				String str_olican_fire_foam_area = edit_olican_fire_foam_area.getText().toString();
				
				// 获取流量
				EditText edit_olican_fire_foam_flow = (EditText) findViewById(R.id.olican_fire_foam_flow);
				
				// 将获取流量转化为字符串的形式
				String str_olican_fire_foam_flow = edit_olican_fire_foam_flow.getText().toString();
				
				//  如果用户没有输入油罐的燃烧面积就按下按钮，则提示用户输入油罐的燃烧面积
				if("".equals(str_olican_fire_foam_area)){
					Toast.makeText(olican_fire_foam.this, "油罐的燃烧面积不可为空",
							Toast.LENGTH_SHORT).show();
				}
				//  如果用户没有输入流量就按下按钮，则提示用户输入流量
				else if("".equals(str_olican_fire_foam_flow)){
					Toast.makeText(olican_fire_foam.this, "流量不可为空",
							Toast.LENGTH_SHORT).show();
				}
				// 将用户输入的有效的油罐的燃烧面积以及流量转换成double类型的数值
				else{
					// 获取有效的油罐的燃烧面积以及流量并转换成double类型的数值
					double olican_fire_foam_area = Double.valueOf(str_olican_fire_foam_area);

					// 获取有效的流量并转换成double类型的数值
					double olican_fire_foam_flow = Double.valueOf(str_olican_fire_foam_flow);
					
					// 计算该油罐火灾的用水量
					double olican_fire_foam_water_result = olican_fire_foam_area * 0.94;
					
					// 计算该油罐火灾的泡沫原液用量
					double olican_fire_foam_stoste_result = olican_fire_foam_area * 0.06;
					
					// 显式的传递计算的数值
					Intent intent = new Intent(olican_fire_foam.this, oilcan_fire_foam_result.class);
					// 传递计算的该油罐火灾的用水量
					intent.putExtra("olican_fire_foam_water_result", olican_fire_foam_water_result);
					
					// 传递计算的该油罐火灾的泡沫原液用量
					intent.putExtra("olican_fire_foam_stoste_result", olican_fire_foam_stoste_result);
					startActivity(intent);
				}
			}
		});
	}
	
}
