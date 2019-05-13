package com.cristhian.com.patroncommand;

import android.content.Context;

public class SayHello implements Command {

    private SpeakReceptor speak;

    public SayHello(SpeakReceptor speak) {
        this.speak = speak;
    }

    @Override
    public void execute(Context context) {

        speak.sayHello(context);

    }

}
