package android.example.com.scrollingtextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /**
     * ScrollView is a subclass of FrameLayout Place only one view as a child within it—a
     * child view contains the entire contents to scroll.
     *  This child view may itself be a ViewGroup (such as LinearLayout) containing UI elements.
     *For large text size:
     *  android:textAppearance "@android:style/TextAppearance.DeviceDefault.Large"
     *  For normal text size:
     *  android:textAppearance"@android:style/TextAppearance.DeviceDefault"
     *
     *  You can combine bold and italics by combining the tags, as in <b><i>... words...</i></b>. string file
     *  for new line or line break use: \n
     *  AUse the android:autoLink="web" attribute to make web links in the text clickable.
     *  we can use android:lineSpacingExtra="10sp" for extra line space
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}