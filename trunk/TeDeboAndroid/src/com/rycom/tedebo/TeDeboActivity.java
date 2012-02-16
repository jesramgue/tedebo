package com.rycom.tedebo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TeDeboActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView ltvTemp = (TextView) findViewById(R.id.text1);
		try {
			// Construct data
			String data = URLEncoder.encode("json", "UTF-8") + "="
					+ URLEncoder.encode("{\"token\":\"b4002296512194846ce23e76139bfda5\"}", "UTF-8");
			// data += "&" + URLEncoder.encode("key2", "UTF-8") + "="
			// + URLEncoder.encode("value2", "UTF-8");

			// Send data
			URL url = new URL("http://10.95.126.231:8080/TeDeboWeb/Login");
			URLConnection conn = url.openConnection();
			conn.setDoOutput(true);

			OutputStreamWriter wr = new OutputStreamWriter(
					conn.getOutputStream());
			wr.write(data);
			wr.flush();

			// Get the response
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				// Process line...
				ltvTemp.setText(ltvTemp.getText() + line);
			}
			// wr.close();
			rd.close();
		} catch (Exception e) {
			ltvTemp.setText("" + e.toString());
		}
	}
}