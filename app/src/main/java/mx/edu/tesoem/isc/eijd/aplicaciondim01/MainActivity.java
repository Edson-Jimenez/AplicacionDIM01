package mx.edu.tesoem.isc.eijd.aplicaciondim01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SuperActivityToast.create(this, new Style(), Style.TYPE_BUTTON)
                .setButtonText("CONTINUAR")
                .setOnButtonClickListener("good_tag_name", null, null)
                .setProgressBarColor(Color.WHITE)
                .setText("LIBRERIA IMPORTADA CORRECTAMENTE")
                .setDuration(Style.DURATION_LONG)
                .setFrame(Style.FRAME_KITKAT)
                .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_BLUE_GREY))
                .setAnimations(Style.ANIMATIONS_POP).show();
    }

}