package com.example.rv.android_reportcard;

/**
 * Created by developer on 2/20/17.
 */

public class ReportCard {

    /**
     * STATE
     */
    private String mSubject;
    private String mQuarter_1;
    private String mQuarter_2;
    private String mQuarter_3;
    private String mQuarter_4;

    /**
     * CONSTRUCTOR
     */
    public ReportCard(String subject, String quarter_1, String quarter_2, String quarter_3, String quarter_4) {
        mSubject = subject;
        mQuarter_1 = quarter_1;
        mQuarter_2 = quarter_2;
        mQuarter_3 = quarter_3;
        mQuarter_4 = quarter_4;
    }

    /**
     * METHOD
     */

    public String getSubject() {
        return mSubject;
    }

    public String getQuarter_1() {
        return mQuarter_1;
    }

    public String getQuarter_2() {
        return mQuarter_2;
    }

    public String getQuarter_3() {
        return mQuarter_3;
    }

    public String getQuarter_4() {
        return mQuarter_4;
    }
}

