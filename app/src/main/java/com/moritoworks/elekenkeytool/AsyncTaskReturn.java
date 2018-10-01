package com.moritoworks.elekenkeytool;


import android.os.AsyncTask;
import java.io.IOException;

public class AsyncTaskReturn extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground (String... params) {
        try {
            PostMessage.send("xxxx-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", "app-test", "ElekenPost - Debug", "鍵返した");
        } catch (IOException e){

            return "";
        }
        return "";
    }

}