package letsmove.awaited.onboarding;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Slider_Adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Slider_Adapter(Context context){
        this.context = context;
    }//end constructor

    //Arrays
    public int[] slide_images = {
            R.drawable.nature,
            R.drawable.simplicity_is_key,
            R.drawable.color_drops
    };//end slide_images

    public String[] slide_headings = {
      "EAT",
            "SLEEP",
            "CODE"
    };

    public String[] slide_descriptions = {
            "This is going to awesome", "This is going to awesome", "This is going to awesome"
    };
    @Override
    public int getCount() {
        return slide_headings.length;
    }//end getCount

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }//end isviewfromobject

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
         layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
         View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = view.findViewById(R.id.slide_image);
        TextView slideHeading = view.findViewById(R.id.slide_heading);
        TextView slideDescription = view.findViewById(R.id.slide_description);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descriptions[position]);

        container.addView(view);

        return view;
    }//end object

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout)object);
    }
}
