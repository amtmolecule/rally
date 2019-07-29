/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.material.themebuilder

import android.app.Application
import android.content.Context
import io.material.themebuilder.data.PreferenceRepository

class App : Application() {

  lateinit var preferenceRepository: PreferenceRepository

  override fun onCreate() {
    super.onCreate()
    preferenceRepository = PreferenceRepository(
      getSharedPreferences(DEFAULT_PREFERENCES, Context.MODE_PRIVATE)
    )
  }

  companion object {
    const val DEFAULT_PREFERENCES = "default_preferences"
  }
}
