package no.nordicsemi.android.nrfthingy.ClusterHead;

import android.bluetooth.le.AdvertiseSettings;

/*important constants*/
public class ClhConst {
    //for advertiser
    public static final String clusterHeadName="CH"; //max 4 characters
    public static final int MAX_ADVERTISE_LIST_ITEM=512; //max items in waiting list for advertising
    public static final int ADVERTISING_INTERVAL=200; //default 200 ms interval for each advertising packet
    public static final int THINGY_DATA_TYPE_PROCESSED_SOUND=10;
    public static final int CLH_ADVERTISE_TX_POWER= AdvertiseSettings.ADVERTISE_TX_POWER_MEDIUM; // TX Power of Advertiser


    //----------
    //for scanner
    public static final int MIN_SCAN_RSSI_THRESHOLD=-80;    //min RSSI of receive packet from other clusterheads
    public static final long SCAN_PERIOD = 60000*5;   //scan 10 minutes
    public static final long REST_PERIOD=1000; //rest in 1 sec
    public static final int SCAN_HISTORY_LIST_SIZE=512; //max item in history list

    //for processor
    public static final int MAX_PROCESS_LIST_ITEM=128; //max items in waiting list for processing

}
