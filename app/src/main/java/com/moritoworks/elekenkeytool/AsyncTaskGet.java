package com.moritoworks.elekenkeytool;


import android.os.AsyncTask;
import java.io.IOException;

public class AsyncTaskGet extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground (String... params) {
        try {
            PostMessage.send("xxxx-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "app-test", "ElekenPost - Debug", "鍵借りた");
        } catch (IOException e){

            return "";
        }
        return "";
    }


}