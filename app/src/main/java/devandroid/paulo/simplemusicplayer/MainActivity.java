package devandroid.paulo.simplemusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.realgear.multislidinguppanel.Adapter;
import com.realgear.multislidinguppanel.MultiSlidingUpPanelLayout;
import com.realgear.multislidinguppanel.PanelStateListener;

import java.util.ArrayList;
import java.util.List;

import devandroid.paulo.simplemusicplayer.views.panels.RootMediaPlayerPanel;
import devandroid.paulo.simplemusicplayer.views.panels.RootNavigationBarPanel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiSlidingUpPanelLayout panelLayout = findViewById(R.id.multiSlidingUpPanel);

        List<Class<?>> items = new ArrayList<>();

        items.add(RootNavigationBarPanel.class);
        items.add(RootMediaPlayerPanel.class);

        panelLayout.setPanelStateListener(new PanelStateListener(panelLayout));
        panelLayout.setAdapter(new Adapter(this, items));
    }
}