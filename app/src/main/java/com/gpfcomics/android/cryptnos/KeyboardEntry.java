package com.gpfcomics.android.cryptnos;

import android.content.Intent;
import android.inputmethodservice.InputMethodService;

/**
 * Created by alex on 2017/03/26.
 */

public class KeyboardEntry extends InputMethodService {

    @Override
    public void onCreate() {
        super.onCreate();

        Intent intent = new Intent(this, CryptnosMainMenu.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
