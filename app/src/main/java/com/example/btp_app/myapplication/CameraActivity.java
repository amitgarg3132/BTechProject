

package com.example.btp_app.myapplication;

import android.app.Activity;
import android.os.Bundle;

public class CameraActivity extends Activity implements Camera2BasicFragment.onDoneSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance()).addToBackStack("camera1")
                    .commit();
        }
    }

    @Override
    public void onClicked() {

            getFragmentManager().beginTransaction()
                    .replace(R.id.container, SelectOffer.newInstance()).addToBackStack("camera1")
                    .commit();

    }
}
