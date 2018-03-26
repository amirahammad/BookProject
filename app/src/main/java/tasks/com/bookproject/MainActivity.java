package tasks.com.bookproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void doSomething(View view){
        switch (view.getId()){
            case R.id.shareButton:
                Intent sendIntent = new Intent() ;
                sendIntent.setAction(Intent.ACTION_SEND) ;
                sendIntent.putExtra(Intent.EXTRA_SUBJECT,"شارك التطبيق مع اصدقائك ") ;
                sendIntent.setType("text/plain") ;
                startActivity(Intent.createChooser(sendIntent,"اختار التطبيق"));
                break;
            case R.id.closeButton:
                onBackPressed();
                break;
            case R.id.aboutAppLayout:
                Intent n2 = new Intent(getApplication(), AboutAppActivity.class);
                startActivity(n2);
                break;
            case R.id.aboutElFekiLayout:
                Intent n1 = new Intent(getApplication(),AboutAfekiActivity.class) ;
                startActivity(n1);
                break;
            case R.id.showingBookLayout:
                Intent n3 = new Intent(getApplication(),ShowingBookActivity.class) ;
                startActivity(n3);
                break;
            case R.id.famousSentence:
                Intent n4 = new Intent(getApplication(),FamouseSentences.class) ;
                startActivity(n4);
                break;


        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
        builder1.setTitle("لخروج من التطبيق") ;
        builder1.setMessage("هل تود الخروج");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "نعم",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                });

        builder1.setNegativeButton(
                "لا",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
}
