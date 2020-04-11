package NTU.VuQuangLang.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView;
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    TextView txtv;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // anh xa
        txtv = (textView) FindViewById(R.id.TEXTVIEWHELLOWORLD)
        // viet code
        txtv.setText("HELLO WORLD");

    }
}
