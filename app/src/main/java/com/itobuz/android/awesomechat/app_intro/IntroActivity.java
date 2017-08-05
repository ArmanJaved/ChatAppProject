package com.itobuz.android.awesomechat.app_intro;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;
import com.google.android.gms.ads.InterstitialAd;
import com.itobuz.android.awesomechat.firstlogin.UserFirstLoginActivity;

public class IntroActivity extends AppIntro2{

    private InterstitialAd mInterstitialAd;
    private String adUnitId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setGoBackLock(true);
        showSkipButton(false);

        addSlide(new OneFragment());
        addSlide(new TwoFragment());
        addSlide(new ThreeFragment());

       /* mInterstitialAd = new InterstitialAd(this);
        adUnitId = "[YOUR_INTERSTITIAL_AD_UNIT_ID]";
        mInterstitialAd.setAdUnitId(adUnitId);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());*/
        Intent intent = new Intent(IntroActivity.this,UserFirstLoginActivity.class);
        startActivity(intent);

    }
//    @Override
//    public void onSkipPressed(Fragment currentFragment) {
//        super.onSkipPressed(currentFragment);
//        //Finish this activity
//        finish();
//    }
//
//    @Override
//    public void onDonePressed(Fragment currentFragment) {
//        super.onDonePressed(currentFragment);
//
//        if (mInterstitialAd.isLoaded()) {
//            mInterstitialAd.show();
//        }
//
//        mInterstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdClosed() {
//                // Load the next interstitial.
//
//                finish();
//            }
//
//        });
//
//
//    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);

        //do the rest
    }

}
