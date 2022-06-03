/*
* Copyright (C) 2021 The Android Open Source Project.
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
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.dog1,
            "Nala",
            "3",
            "Strolling in the Garden"
        ),
        Dog(
            R.drawable.dog2,
            "Kali",
            "1",
            "Sunbathing"
        ),
        Dog(
            R.drawable.dog3,
            "Snow",
            "2",
            "Playing in the snow"
        ),
        Dog(
            R.drawable.dog4,
            "Jake",
            "1",
            "Surfing"
        ),
        Dog(
            R.drawable.dog5,
            "Oreo",
            "1",
            "Playing tennis ball"
        ),
        Dog(
            R.drawable.dog6,
            "Rollo",
            "4",
            "Reading"
        ),
        Dog(
            R.drawable.dog7,
            "Chase",
            "3",
            "Playing Frisbee"
        ),
        Dog(
            R.drawable.dog8,
            "Finn",
            "2",
            "Swimming"
        )
    )
}
