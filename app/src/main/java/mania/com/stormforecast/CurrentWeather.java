package mania.com.stormforecast;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by chandu on 5/15/2017.
 */
public class CurrentWeather {
    private String mIcon;
    private long mTime;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private double mTemperature;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }
    public int getIconId(){
        int iconId = R.drawable.clear_day;
        if (mIcon.equals("clear-day")){
            iconId = R.drawable.clear_day;
        }
        else if(mIcon.equals("clear-night")){
            iconId = R.drawable.clear_night;
        }
        else if(mIcon.equals("cloudy")){
            iconId = R.drawable.cloudy;
        }
        else if(mIcon.equals("cloudy-night")){
            iconId = R.drawable.cloudy_night;
        }
        else if(mIcon.equals("degree")){
            iconId = R.drawable.degree;
        }
        else if(mIcon.equals("fog")){
            iconId = R.drawable.fog;
        }
        else if(mIcon.equals("partly-cloudy-day")){
            iconId = R.drawable.partly_cloudy_day;
        }
        else if(mIcon.equals("partly-cloudy-night")){
            iconId = R.drawable.partly_cloudy_night;
        }
        else if(mIcon.equals("rain")){
            iconId = R.drawable.rain;
        }
        else if(mIcon.equals("refresh")){
            iconId = R.drawable.refresh;
        }
        else if(mIcon.equals("snow")){
            iconId = R.drawable.snow;
        }
        else if(mIcon.equals("sunny")){
            iconId = R.drawable.sunny;
        }
        else if(mIcon.equals("wind")){
            iconId = R.drawable.wind;
        }
        return iconId;
    }

    public long getTime() {
        return mTime;
    }
    public String getFormattedTime(){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime =new Date(getTime() *1000);
        String timeString = formatter.format(dateTime);
        return timeString;
    }
    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {

        int mTempF = (int) Math.round(mTemperature);

        int mTempC ;
        mTempC =  (mTempF - 32)*5/9;

        return mTempC;
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {

        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance *100;
        return (int) Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }
}
