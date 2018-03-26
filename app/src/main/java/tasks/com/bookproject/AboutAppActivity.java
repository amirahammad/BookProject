package tasks.com.bookproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutAppActivity extends AppCompatActivity {
    ImageView backButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        backButton = (ImageView)findViewById(R.id.backBtn)  ;
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    public void doSomething(View view){
        switch (view.getId()){
            case R.id.moreApps:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
                break;
            case R.id.sugession:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:reemmahmoud726@gmail.com?subject=تطبيق الطريق إلى النجاح")));
                break;
            case R.id.visitWebsit:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com")));
                break;
            case R.id.evaluation:
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com")));
                break;
        }

    }
}
