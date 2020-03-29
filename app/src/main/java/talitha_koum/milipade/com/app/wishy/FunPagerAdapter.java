package talitha_koum.milipade.com.app.wishy;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


/********************
 * In general an Adapter is an object that is used to create Views
 * to represent some data that comes from sone sort of datasource.
 * This one is pulling the data from the http://numbersapi.com web API.
 * Other adapters might use a local datasource such as a file, or an SQL database.
 * 
 * This adapter will dynamically create each "page" View for us
 * as they are needed. It handles choosing and setting a random color
 * for the background and the card, it also fires of the AsyncTask that will
 * pull the data from the web api and set it into our TextView
 ********************/
public class FunPagerAdapter extends PagerAdapter{
	private int[] colors = {Color.parseColor("#00B050"),
							Color.parseColor("#FFC000"),
							Color.parseColor("#DB1351"),
							Color.parseColor("#B61C83"),
							Color.parseColor("#0070C0")};
	

	private Random rnd;
    private String currentText;

    public FunPagerAdapter(){
		super();
		rnd = new Random();
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((View) object);
	}
	
	@Override
	public Object instantiateItem(View collection, int pos) {
		LayoutInflater inflater = (LayoutInflater) collection.getContext()
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		//View v = null;
		
		View page = inflater.inflate(R.layout.page_fun, null);
		
		RelativeLayout back = (RelativeLayout)page.findViewById(R.id.background);
		
		
		int randomColor = rnd.nextInt(5);
		
		TextView tv = (TextView)page.findViewById(R.id.lblTxt);
		tv.setBackgroundResource(R.drawable.generic_back);
		//back.setBackgroundColor(colors[randomColor]);
		currentText = Quotes.getRandomQuotes();
		tv.setText(currentText);
        setCurrentText(currentText);
		((ViewPager) collection).addView(page, 0);
		return page;
	}
	
	

	@Override
	public void destroyItem(View collection, int position, Object view) {
		//Util.Log("destroying" + position);
		((ViewPager) collection).removeView((View) view);
	}


    public String getCurrentText() {

		return currentText;
    }

	@Override
	public int getItemPosition(Object object) {
		return super.getItemPosition(object);
	}

	public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
