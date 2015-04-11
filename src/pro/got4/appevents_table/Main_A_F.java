package pro.got4.appevents_table;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main_A_F extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		WebView webview = new WebView(this);
		webview.setInitialScale(20);
		webview.loadUrl("file:///android_asset/A-F_events.htm");

		setContentView(webview);

		WebSettings settings = webview.getSettings();
		settings.setSupportZoom(true);
		settings.setBuiltInZoomControls(true);
		settings.setUseWideViewPort(true);
	}
}
