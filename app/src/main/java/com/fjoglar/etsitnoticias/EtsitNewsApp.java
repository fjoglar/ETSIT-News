/*
 * Copyright (C) 2016 Felipe Joglar Santos
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
package com.fjoglar.etsitnoticias;

import android.app.Application;

import com.fjoglar.etsitnoticias.data.repository.NewsRepository;
import com.fjoglar.etsitnoticias.data.repository.datasource.NewsSharedPreferences;

public class EtsitNewsApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Set the Context for Repository and SharedPreferences.
        NewsRepository.getInstance().setContext(this);
        NewsSharedPreferences.getInstance().setContext(this);

        NewsSharedPreferences.getInstance().putBoolean(
                NewsSharedPreferences.getInstance().getStringFromResId(R.string.booting_key), true);
    }
}
