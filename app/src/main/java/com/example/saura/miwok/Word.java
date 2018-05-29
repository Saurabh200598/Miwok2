package com.example.saura.miwok;

/**
 * Created by saurabh on 3/12/2018.
 * {@link Word}represents the vocabulary word that user wants to learn
 * It contains default translation and miwok translation for the word
 */

public class Word {

    private String mDefaultTransalation;

    private String mMiwokTransalation;

    //image resource id for word
    private int mImageResourceId=NO_IMAGE_PROVIDE;
     private static final int NO_IMAGE_PROVIDE=-1;
    private int maudio;

    public Word(String defaultTransalation, String miwokTransalation,int audio) {

        mDefaultTransalation = defaultTransalation;
        mMiwokTransalation = miwokTransalation;
        maudio=audio;

    }


    public Word(String defaultTransalation, String miwokTransalation, int imageResourceId,int audio) {

        mDefaultTransalation = defaultTransalation;
        mMiwokTransalation = miwokTransalation;
        mImageResourceId=imageResourceId;
        maudio=audio;
    }

    //return image resource id for the word
    public int getImageResourceId() {

        return mImageResourceId;


    }

    //get the dafault translation of word
    public String getDefaultTransalation() {

        return mDefaultTransalation;
    }

    //get the Miwok translation of word
    public String getMiwokTransalation() {

        return mMiwokTransalation;

    }
    public boolean hasImage()
    {

    return mImageResourceId !=NO_IMAGE_PROVIDE;

    }
    public int getAudio(){return maudio;}

}


