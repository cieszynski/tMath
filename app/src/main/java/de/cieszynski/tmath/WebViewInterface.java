package de.cieszynski.tmath;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebViewInterface {
    Context mContext;

    public WebViewInterface(Context context) {
        mContext = context;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

}
