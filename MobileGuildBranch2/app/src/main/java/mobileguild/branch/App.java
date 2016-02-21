package mobileguild.branch;

import android.app.Application;

import io.branch.referral.Branch;

/**
 * Created by rafal on 2/21/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Automatic session tracking
        Branch.getAutoInstance(this);
    }

}
