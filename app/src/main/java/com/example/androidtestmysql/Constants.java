package com.example.androidtestmysql;

public class Constants {

    private static final String ROOT_URL = "http://192.168.0.6/Android/v1/";

    public static final String URL_REGISTER = ROOT_URL+"registerUser.php";
    public static final String URL_LOGIN = ROOT_URL+"userLogin.php";


    public static final String URL_REGISTER_DEVICE = "http://192.168.0.6/FCM/RegisterDevice.php";
    public static final String URL_SEND_SINGLE_PUSH = "http://192.168.0.6/FCM/sendSinglePush.php";
    public static final String URL_SEND_MULTIPLE_PUSH = "http://192.168.0.6/FCM/sendMultiplePush.php";
    public static final String URL_FETCH_DEVICES = "http://192.168.0.6/FCM/GetRegisteredDevices.php";

}
