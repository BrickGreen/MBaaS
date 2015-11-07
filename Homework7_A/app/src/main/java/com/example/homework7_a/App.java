package com.example.homework7_a;

/**
 * Created by brickgreen on 11/5/15.
 */
import android.app.Application;
import com.parse.Parse;

public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        String ApplicationID = "kIln8xIjfykaVdxoHYHdz8dy0S8PP6dRg6Bb0u9T";
        String ClientKey = "E9wxXtG3HIpfZb5v3Ywv35v9m61YVoy6k7I8Jfqq";
        Parse.initialize(this, ApplicationID, ClientKey); // Your Application ID and Client Key are defined elsewhere
    }
}
