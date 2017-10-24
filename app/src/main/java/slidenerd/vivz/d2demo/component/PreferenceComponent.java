package slidenerd.vivz.d2demo.component;

import javax.inject.Singleton;

import dagger.Component;
import slidenerd.vivz.d2demo.FragmentA;
import slidenerd.vivz.d2demo.FragmentB;
import slidenerd.vivz.d2demo.module.PreferenceModule;

/**
 * Created by deepak.mandhani on 24/10/17.
 */

@Singleton
@Component(modules = PreferenceModule.class)
public interface PreferenceComponent {
    void inject(FragmentA fragmentA);
    void inject(FragmentB fragmentB);
}
