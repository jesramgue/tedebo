package com.rycom.tedebo;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.rycom.tedebo.com.rycom.tedebo.base.communication.SyncCom;

public class TeDeboActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView ltvTemp = (TextView) findViewById(R.id.text1);

        String lsJsonReq = SyncCom.getJsonEncodedText("{\"token\":\"b4002296512194846ce23e76139bfda5\"}");
        ArrayList<String> asData = SyncCom.getData("http://10.95.126.231:8080/TeDeboWeb/Login", lsJsonReq);
        ltvTemp.setText("Texto recibido: ");
        for (String lsTemp : asData) {
            ltvTemp.setText(ltvTemp.getText() + lsTemp + " || ");
        }
	}
}