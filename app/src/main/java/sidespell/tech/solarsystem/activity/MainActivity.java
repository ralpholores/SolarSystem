package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity {


    private ImageView mPlanetImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlanetImage = (ImageView) findViewById(R.id.planetImage);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner spinner = (Spinner) findViewById(R.id.testSpinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Planets);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0)
                {
                    mPlanetImage.setImageResource(R.drawable.mercury);
                }
                else if (position == 1)
                {
                    mPlanetImage.setImageResource(R.drawable.venus);
                }
                else if (position == 2)
                {
                    mPlanetImage.setImageResource(R.drawable.earth);
                }
                else if (position == 3)
                {
                    mPlanetImage.setImageResource(R.drawable.mars);
                }
                else if (position == 4)
                {
                    mPlanetImage.setImageResource(R.drawable.jupiter);
                }
                else if (position == 5)
                {
                    mPlanetImage.setImageResource(R.drawable.saturn);
                }
                else if (position == 6)
                {
                    mPlanetImage.setImageResource(R.drawable.uranus);
                }
                else if (position == 7)
                {
                    mPlanetImage.setImageResource(R.drawable.neptune);
                }
                else if (position == 8)
                {
                    mPlanetImage.setImageResource(R.drawable.pluto);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    static final String[] Planets = new String[] {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Uranus",
            "Neptune",
            "Pluto"
    };
    public void changeOption(Spinner spinner) {
        if (spinner.isEnabled()) {
            spinner.setEnabled(false);
        } else {
            spinner.setEnabled(true);

        }
    }



}
