/*
 * Copyright (C) 2015 Willi Ye
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grarak.kerneladiutor;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;

import com.grarak.kerneladiutor.utils.Utils;
import com.nineoldandroids.view.ViewHelper;

/**
 * Created by willi on 20.06.15.
 */
public class KernelActivity extends BaseActivity {

    public static final String LOGO_ARG = "logo_view";
    public static final String KERNEL_JSON_ARG = "kernel_json";

    private View logoContainer;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActionBar actionBar;
        String name;

        logoContainer = findViewById(R.id.logo_container);
        ImageView logoView = (ImageView) findViewById(R.id.logo);
        ViewCompat.setTransitionName(logoView, LOGO_ARG);
    }

    @Override
    public int getParentViewId() {
        return R.layout.activity_kernel;
    }

    @Override
    public View getParentView() {
        return null;
    }

    @Override
    public Toolbar getToolbar() {
        return toolbar == null ? toolbar = (Toolbar) findViewById(R.id.toolbar) : toolbar;
    }

    public View getLogoContainer() {
        return logoContainer;
    }

    @Override
    public void onBackPressed() {
        if (logoContainer != null && ViewHelper.getTranslationY(logoContainer) >= -logoContainer.getHeight() / 2)
            super.onBackPressed();
        else finish();
    }
}
