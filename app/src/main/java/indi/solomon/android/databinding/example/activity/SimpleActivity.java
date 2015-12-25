/*
 * This file is copyrighted Solomon.liu all
 * Solomon , 2015
 */
package indi.solomon.android.databinding.example.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import indi.solomon.android.databinding.example.MainApplication;
import indi.solomon.android.databinding.example.R;
import indi.solomon.android.databinding.example.databinding.ActivitySimpleBinding;
import indi.solomon.android.databinding.example.vm.MyHandlers;
import indi.solomon.android.databinding.example.vm.User;

/**
 * Created by Solomon.liu on 2015/12/25.
 *
 */
public class SimpleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySimpleBinding viewDataBinding= DataBindingUtil.setContentView(this, R.layout.activity_simple);
        Log.d(MainApplication.TAG, "viewDataBinding class=" + viewDataBinding.getClass().getName());
        MyHandlers myHandlers=new MyHandlers(viewDataBinding);
        User user = new User("Test", "User");
        viewDataBinding.setUser(user);
        viewDataBinding.setMyHandlers(myHandlers);
        findViewById(R.id.confirm2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SimpleActivity.this,"data:"+viewDataBinding.etFirstName.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });

    }
}
