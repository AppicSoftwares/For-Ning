package com.taghawk.bluesnap;

import com.bluesnap.androidapi.services.BluesnapToken;
import com.bluesnap.androidapi.services.TokenProvider;

public class BlueSnapDetails extends BluesnapToken {

    //sandbox url
 //   public static final String SANDBOX_URL = "https://sandbox.bluesnap.com/services/2/";

    //live url
    public static final String PRODUCTION_URL = "https://ws.bluesnap.com/services/2/";


    public static final String PRODUCTION_TOKEN_CREATION = "payment-fields-tokens";
    public static final String PRODUCTION_CREATE_TRANSACTION = "transactions";
    public static final String PRODUCTION_VAULTED_SHOPPER = "vaulted-shoppers";
    public static final String PRODUCTION_PLAN = "recurring/plans";
    public static final String PRODUCTION_SUBSCRIPTION = "recurring/subscriptions";
    public static final String PRODUCTION_REFUND_TRANSACTION = "transactions/";
    public static final String VENDORS = "vendors";


    //sandbox details
 //   public static final String SANDBOX_USER = "API_1585933656259681217206";
 //   public static final String SANDBOX_PASS = "kwaHgaT1010";


    //live details
    public static final String PRODUCTION_USER = "API_15955857495392110956915";
    public static final String PRODUCTION_PASS = "TagHawk1010";


  //  public static final String SANDBOX_MERCHANT_ID = "779311";      //sandbox merchant id
    public static final String PRODUCTION_MERCHANT_ID = "1203294";     //production merchant id


    public BlueSnapDetails(String merchantToken, TokenProvider tokenProvider) {
        super(merchantToken, tokenProvider);
    }

    //Sift sandbox
//    public static final String SIFT_ACCOUNT_ID = "5e7bd7a8ef0a89e22d2764bd";
 //   public static final String SIFT_BEACON_KEY = "7d0438859d";


    //Sift production
    public static final String SIFT_ACCOUNT_ID = "5e7bd7a8ef0a89e22d2764bd";
    public static final String SIFT_BEACON_KEY = "7d0438859d";


}
