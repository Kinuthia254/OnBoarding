package letsmove.awaited.onboarding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Selection_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selction);

        TextView tourism = findViewById(R.id.tourism);

        tourism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tourismIntent = new Intent(Selection_Activity.this, Tourism_Activity.class);

                startActivity(tourismIntent);
            }//end onclick

        });//end setOnclickListener

        TextView parks = findViewById(R.id.parks_recreations);

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(Selection_Activity.this, Parks_And_Recreational_Activity.class);

                startActivity(parksIntent);
            }//end onclick

        });//end setOnclickListener

        TextView accommodation = findViewById(R.id.accommodation);

        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent accommodationIntent = new Intent(Selection_Activity.this, Accommodation_Activity.class);

                startActivity(accommodationIntent);


            }//end onclick

        });//end setOnclickListener

        TextView airport = findViewById(R.id.airport);

        airport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent airportIntent = new Intent(Selection_Activity.this, Airport_Activity.class);

                startActivity(airportIntent);

            }//end onclick

        });//end setOnclickListener

        TextView about_nairobi = findViewById(R.id.about_nairobi);

        about_nairobi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutIntent = new Intent(Selection_Activity.this, About_Nairobi_Activity.class);

                startActivity(aboutIntent);


            }//end onclick

        });//end setOnclickListener

    }//end oncreate
}//end class selection
