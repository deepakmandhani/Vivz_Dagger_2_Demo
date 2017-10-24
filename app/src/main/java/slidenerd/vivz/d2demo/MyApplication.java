package slidenerd.vivz.d2demo;

import android.app.Application;

import slidenerd.vivz.d2demo.component.DaggerPreferenceComponent;
import slidenerd.vivz.d2demo.component.PreferenceComponent;
import slidenerd.vivz.d2demo.module.PreferenceModule;

/**
 * Created by vivz on 11/09/15.
 */
public class MyApplication extends Application{

    PreferenceComponent preferenceComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        preferenceComponent = DaggerPreferenceComponent
                .builder()
                .preferenceModule(new PreferenceModule(this))
                .build();
    }

    public PreferenceComponent getPreferenceComponent() {
        return preferenceComponent;
    }
}
