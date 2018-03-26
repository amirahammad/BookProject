package tasks.com.bookproject;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Freeware Sys on 26/03/2018.
 */

public class ViewDialog {
    public void showDialog(Activity activity, String msg, String titleOfSentence) {
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.activity_showing_book);

        TextView text = (TextView) dialog.findViewById(R.id.text_dialog);
        TextView title = (TextView) dialog.findViewById(R.id.title);

        text.setText(msg);
        title.setText(titleOfSentence);
        ImageView dialogButton = (ImageView) dialog.findViewById(R.id.btn_dialog);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
