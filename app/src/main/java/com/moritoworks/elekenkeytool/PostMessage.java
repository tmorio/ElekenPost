package com.moritoworks.elekenkeytool;

import java.io.IOException;
import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class PostMessage {

       private static final String postUrl = "https://slack.com/api/chat.postMessage";

        public static String send(String token, String channel, String userName, String text)
			throws UnsupportedEncodingException, IOException {

            try {
                byte[] postData = String.format("token=%1s&channel=%2s&username=%3s&text=%4s", token,
                        channel, userName, URLEncoder.encode(text, "utf-8")).getBytes();

                HttpURLConnection conn = (HttpURLConnection) new URL(postUrl).openConnection();
                conn.setDoOutput(true);
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Length", Integer.toString(postData.length));
                try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                    wr.write(postData);
                }
                try (Scanner s = new Scanner(conn.getInputStream())) {
                    return s.useDelimiter("\\A").hasNext() ? s.useDelimiter("\\A").next() : "";
                }
            } catch (IOException e) {
                return "Error";
            }
        }

}
