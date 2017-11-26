package appbuilder6a.trueyou6a;


import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

public class TrueyouApplication extends Application {
    // TODO : Might wanna try the onActivityResult way instaed
    public static int pageStatus;

    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
