package com.cristhian.com.patroncommand;

import android.content.Context;

public class SayBye implements Command {
    private SpeakReceptor speak;

    public SayBye(SpeakReceptor speak) {
        this.speak = speak;
    }

    @Override
    public void execute(Context context) {

        speak.sayBye(context);

    }
}
