[![CircleCI](https://circleci.com/gh/Drjacky/Cevt/tree/master.svg?style=svg)](https://circleci.com/gh/Drjacky/Cevt/tree/master)

This repository contains a sample app that implements MVP architecture using Dagger2, Realm, RxJava, Retrofit2, Picasso,
ConstrainLayout, RealmFieldNamesHelper, GSON, ButterKnife, Data Binding.

![Screenshot](https://raw.githubusercontent.com/Drjacky/Cevt/master/Goeteborg.png)

#### WebService:
api.openweathermap.org/data/2.5/weather

#### The app has following packages:
1. **data**: It contains all the data accessing and manipulating components.
2. **di**: Dependency providing classes.
3. **ui**: View classes along with their corresponding Presenters and Interactors.
4. **utils**: Utility classes.

#### Classes have been designed in such a way that it could be inherited and maximize the code reuse.

This architecture includes Interactors and DbHelpers to make it fit for very large projects and prevent an Anti-Pattern;
For smaller projects, the Interactors could replaced by a DataManager.

### Installation

1. **Android Studio 3.1.3**
2. **Android Tools Build Plugin 3.1.3**
3. **Kotlin Version 1.2.51**
4. **Java Version 1.8**
5. **Realm Plugin 5.3.0**
6. **Android SDK 28**


### License
```
   MIT License
   
   Copyright (c) 2018 Dr.jacky
   
   Permission is hereby granted, free of charge, to any person obtaining a copy
   of this software and associated documentation files (the "Software"), to deal
   in the Software without restriction, including without limitation the rights
   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
   copies of the Software, and to permit persons to whom the Software is
   furnished to do so, subject to the following conditions:
   
   The above copyright notice and this permission notice shall be included in all
   copies or substantial portions of the Software.
   
   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
   SOFTWARE.
```