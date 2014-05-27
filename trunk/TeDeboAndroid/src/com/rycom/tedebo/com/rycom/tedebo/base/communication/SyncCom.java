package com.rycom.tedebo.com.rycom.tedebo.base.communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by jramirez on 27/05/2014.
 */
public abstract class SyncCom {
    public static ArrayList<String> getData(final String asUrl, final String asJsonData) {
        ArrayList<String> laRet = new ArrayList<String>();
        try {
            // Construct data
            //Example asJsonData: asJsonData:
        /*String data = URLEncoder.encode("json", "UTF-8") + "="
                + URLEncoder.encode("{\"token\":\"b4002296512194846ce23e76139bfda5\"}", "UTF-8");*/

            // data += "&" + URLEncoder.encode("key2", "UTF-8") + "="
            // + URLEncoder.encode("value2", "UTF-8");

            // Send data
            //Example: URL url = new URL("http://10.95.126.231:8080/TeDeboWeb/Login");
            URL url = new URL("asUrl");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            OutputStreamWriter wr = new OutputStreamWriter(
                    conn.getOutputStream());
            wr.write(asJsonData);
            wr.flush();

            // Get the response
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                // Process line...
                laRet.add(line);
            }
            // wr.close();
            rd.close();
        } catch (Exception e) {
            System.err.println("Error en SyncCom" + e.getMessage());
            e.printStackTrace();
        } finally {
            return laRet;
        }
    }

    public static String getJsonEncodedText(final String asData) {
        String lsRet = "";
        try{
            lsRet = URLEncoder.encode("json", "UTF-8") + "="
                    + URLEncoder.encode(asData, "UTF-8");
        } catch (Throwable athError) {
            System.err.println("Error en SyncCom" + athError.getMessage());
            athError.printStackTrace();
        } finally {
            return lsRet;
        }
    }
}
