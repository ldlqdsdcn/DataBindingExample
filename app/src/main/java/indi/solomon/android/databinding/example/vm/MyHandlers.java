/*
 * This file is copyrighted Solomon.liu all
 * Solomon , 2015
 */
package indi.solomon.android.databinding.example.vm;

import android.view.View;
import android.widget.Toast;

import indi.solomon.android.databinding.example.databinding.ActivitySimpleBinding;

/**
 * Created by Solomon.liu on 2015/12/25.
 */
public class MyHandlers {

    ActivitySimpleBinding viewDataBinding;

    public MyHandlers(ActivitySimpleBinding viewDataBinding) {
        this.viewDataBinding = viewDataBinding;
    }

    public void onClickFriend(View view) {
        User user = viewDataBinding.getUser();

        Toast.makeText(view.getContext(), "Hello:" +viewDataBinding.etFirstName.getText().toString() + " " + viewDataBinding.etLastName.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
