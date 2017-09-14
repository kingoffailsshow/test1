package com.example.bajric.test1;

/**
 * Created by bajric on 14.09.2017..
 */

public class Question {
    private  int mTextResId;

    public int getTextResId() {
        return mTextResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    private boolean mAnswerTrue;
    public  Question(int textResId,boolean answerTrue){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;

    }
}
