/**
 * Created by monash on 8/30/2016.
 */

package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    // declare data
    private String mMiwokTranslation;
    private String mDefaultTranslation;



    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */


    // Constructor for Word object. Instantiate an instance.
    Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // return the default translation string
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // return the miwok translation string
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
