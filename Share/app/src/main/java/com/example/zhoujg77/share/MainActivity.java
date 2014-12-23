package com.example.zhoujg77.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent sendIntent = new Intent();
//                sendIntent.setAction(Intent.ACTION_SEND);
//                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
//                sendIntent.setType("text/plain");
//                startActivity(sendIntent);
                //不选择每次都全部显示 默认了分享app也会显示全部分享APP
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                //分享功能不只是Intent.EXTRA_TEXT，还可以 EXTRA_EMAIL, EXTRA_CC, EXTRA_BCC,EXTRA_SUBJECT. 只需要接受方完成响应数据接受。
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.abc_action_bar_home_description)));

                //image
//                Intent shareIntent = new Intent();
//                shareIntent.setAction(Intent.ACTION_SEND);
//                shareIntent.putExtra(Intent.EXTRA_STREAM, uriToImage);
//                shareIntent.setType("image/jpeg");
//                startActivity(Intent.createChooser(shareIntent, getResources().getText(R.string.send_to)));
                //imagelist
//                ArrayList<Uri> imageUris = new ArrayList<Uri>();
//                imageUris.add(imageUri1); // Add your image URIs here
//                imageUris.add(imageUri2);
//
//                Intent shareIntent = new Intent();
//                shareIntent.setAction(Intent.ACTION_SEND_MULTIPLE);
//                shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, imageUris);
//                shareIntent.setType("image/*");
//                startActivity(Intent.createChooser(shareIntent, "Share images to.."));

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
