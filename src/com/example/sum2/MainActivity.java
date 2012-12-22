package com.example.sum2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv;
	String s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		s = "";
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void inputNum(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			s += "1";
			break;

		case R.id.btn2:
			s += "2";
			break;

		case R.id.btn3:
			s += "3";
			break;

		case R.id.btn4:
			s += "4";
			break;

		case R.id.btn5:
			s += "5";
			break;

		case R.id.btn6:
			s += "6";
			break;

		case R.id.btn7:
			s += "7";
			break;

		case R.id.btn8:
			s += "8";
			break;

		case R.id.btn9:
			s += "9";
			break;

		case R.id.btn0:
			s += "0";
			break;

		case R.id.btnPlus:
			s += "+";
			break;
		}
		tv.setText(s);
	}

	public void equal(View v) {
		tv.setText(getResult());
		s = "";
	}

	protected CharSequence getResult() {
		String text = tv.getText().toString();
		String[] array = text.split("\\+");
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += Integer.parseInt(array[i]);
		}
		return String.valueOf(result);
	}
}