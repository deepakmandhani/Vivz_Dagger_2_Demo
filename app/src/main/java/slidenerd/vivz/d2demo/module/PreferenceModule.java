package slidenerd.vivz.d2demo.module;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import slidenerd.vivz.d2demo.MyApplication;

/**
 * Created by deepak.mandhani on 24/10/17.
 */

@Module
public class PreferenceModule {

    private MyApplication myApplication;

    public PreferenceModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Singleton
    @Provides
    public SharedPreferences provideSharedPreference() {
        return PreferenceManager.getDefaultSharedPreferences(myApplication);
    }

}
