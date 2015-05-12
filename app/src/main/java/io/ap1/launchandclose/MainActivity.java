package io.ap1.launchandclose;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;


public class MainActivity extends Activity {

    static final String EXTRA_MESSAGE = "fi.finwe.koloreyesandroid.EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv_base = (WebView) findViewById(R.id.wv_base);

        String htmlContent = "<html>\n" +
                "<head></head>\n" +
                "<body>\n" +
                "  <a href=\"intent://scan/#Intent;scheme=koloreyes360videoplayer;package=fi.finwe.koloreyesandroid;S.fi.finwe.koloreyesandroid.EXTRA_MESSAGE=http://streams.kolor.com/streams/ae109b42-60bd-4a0d-aa7c-30692f85fcf7/source.03-1080p_HD.mp4;end\"> Play video in application</a>\n" +
                "</body>\n" +
                "</html>";
        //String path = getFilesDir().toString();
        //Log.e("internal path: ", path);
        wv_base.loadData(htmlContent, "text/html", "utf-8");

        String url = "http://streams.kolor.com/streams/b0470889-2e71-4c47-bc9e-541c5f0f6721/source.03-1080p_HD.mp4";

        Intent intent = new Intent("android.intent.action.MAIN");

        intent.setClassName("fi.finwe.koloreyesandroid", "fi.finwe.koloreyesandroid.MainActivity");
        intent.putExtra(EXTRA_MESSAGE, url);
        startActivity(intent);

/*
        Intent goToNewApp = new Intent("android.intent.action.MAIN");
        goToNewApp.setComponent(ComponentName.unflattenFromString("fi.finwe.koloreyesandroid/fi.finwe.koloreyesandroid.MainActivity"));
        goToNewApp.setData(Uri.parse(url));
*/
        /*
        startActivity(goToNewApp);

        try {
            Thread.sleep(3000);
            Toast.makeText(getBaseContext(), "go to another activity", Toast.LENGTH_SHORT).show();
            Intent goBack = new Intent(MainActivity.this, ActivityJump.class);
            startActivity(goBack);
        } catch (InterruptedException ie) {
            //Handle exception
        }
        */
    }


}
