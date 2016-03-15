# KernelAdiutor

![Screenshot](https://raw.githubusercontent.com/Grarak/KernelAdiutor/master/screenshots/screenshot.png)

## Kernel Downloader

This is a feature which allows the user to download different custom kernels for their device. To add more kernel the developers have to add support by their own. I wrote up a [documentation](https://github.com/Grarak/KernelAdiutor/wiki/Adding-Download-Support) which explains how to do this.

## Download & Build

Clone the project and come in:

``` bash
$ git clone git://github.com/spezi77/KernelAdiutor.git
$ cd android_packages_apps_KernelAdiutor
$ ./gradlew build
```

## Credits

I used following libraries:

* Google: [Appcompat v7](https://developer.android.com/tools/support-library/features.html#v7-appcompat)
* Google: [Cardview v7](https://developer.android.com/tools/support-library/features.html#v7-cardview)
* Google: [Recyclerview v7](https://developer.android.com/tools/support-library/features.html#v7-recyclerview)
* Jerzy Chałupski: [FloatingActionButton](https://github.com/futuresimple/android-floating-action-button)
* Roman Nurik: [Dashclock](https://github.com/romannurik/dashclock)
* Jake Wharton: [NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids)
* Square Inc.: [Picasso](https://github.com/square/picasso)
* Karim Frenn: [MaterialTabs](https://github.com/pizza/MaterialTabs)

Also codes from different people:

#### Andrei F.

* [RootUtils](https://github.com/Grarak/KernelAdiutor/blob/master/library/src/main/java/com/kerneladiutor/library/root/RootUtils.java)

#### apbaxel

* [Constants](https://github.com/Grarak/KernelAdiutor/blob/master/app/src/main/java/com/grarak/kerneladiutor/utils/Constants.java)

_(Many sys interface paths has been taken from his [UKM-Project](https://github.com/apbaxel/UKM))_

#### Brandon Valosek

* [CpuSpyApp](https://github.com/Grarak/KernelAdiutor/blob/master/app/src/main/java/com/bvalosek/cpuspy/CpuSpyApp.java)
* [CpuStateMonitor](https://github.com/Grarak/KernelAdiutor/blob/master/app/src/main/java/com/bvalosek/cpuspy/CpuStateMonitor.java)
* [FrequencyTableFragment](https://github.com/Grarak/KernelAdiutor/blob/master/app/src/main/java/com/grarak/kerneladiutor/fragments/information/FrequencyTableFragment.java)

#### Google

* [ScrimInsetsFrameLayout](https://github.com/Grarak/KernelAdiutor/blob/master/app/src/main/java/com/grarak/kerneladiutor/elements/ScrimInsetsFrameLayout.java)

## License

    Copyright (C) 2015 Willi Ye

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
