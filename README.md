# JgraphTAndroidIssue
Minimum example for issue with JgraphT in android

## IDE
Android Studio 3.2

## ErrorStackTrace
```2018-10-10 17:32:24.264 31107-31107/? E/AndroidRuntime: FATAL EXCEPTION: main
    Process: de.prototype.antonio.myapplication, PID: 31107
    java.lang.RuntimeException: Unable to instantiate activity ComponentInfo{de.prototype.antonio.myapplication/de.prototype.antonio.myapplication.MainActivity}: java.lang.ClassNotFoundException: Didn't find class "de.prototype.antonio.myapplication.MainActivity" on path: DexPathList[[zip file "/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/base.apk"],nativeLibraryDirectories=[/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/lib/arm64, /system/lib64, /vendor/lib64, /product/lib64]]
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3092)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3302)
        at android.app.ActivityThread.-wrap12(Unknown Source:0)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1891)
        at android.os.Handler.dispatchMessage(Handler.java:108)
        at android.os.Looper.loop(Looper.java:166)
        at android.app.ActivityThread.main(ActivityThread.java:7425)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:245)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:921)
     Caused by: java.lang.ClassNotFoundException: Didn't find class "de.prototype.antonio.myapplication.MainActivity" on path: DexPathList[[zip file "/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/base.apk"],nativeLibraryDirectories=[/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/lib/arm64, /system/lib64, /vendor/lib64, /product/lib64]]
        at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:93)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
        at android.app.Instrumentation.newActivity(Instrumentation.java:1178)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3082)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3302) 
        at android.app.ActivityThread.-wrap12(Unknown Source:0) 
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1891) 
        at android.os.Handler.dispatchMessage(Handler.java:108) 
        at android.os.Looper.loop(Looper.java:166) 
        at android.app.ActivityThread.main(ActivityThread.java:7425) 
        at java.lang.reflect.Method.invoke(Native Method) 
        at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:245) 
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:921) 
    	Suppressed: java.lang.NoClassDefFoundError: Failed resolution of: Landroid/support/v7/app/AppCompatActivity;
        at java.lang.VMClassLoader.findLoadedClass(Native Method)
        at java.lang.ClassLoader.findLoadedClass(ClassLoader.java:738)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:363)
        		... 12 more
     Caused by: java.lang.ClassNotFoundException: Didn't find class "android.support.v7.app.AppCompatActivity" on path: DexPathList[[zip file "/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/base.apk"],nativeLibraryDirectories=[/data/app/de.prototype.antonio.myapplication-ITg2wdZRXslry-84TvN0ag==/lib/arm64, /system/lib64, /vendor/lib64, /product/lib64]]
        at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:93)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
        at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
        		... 15 more```
