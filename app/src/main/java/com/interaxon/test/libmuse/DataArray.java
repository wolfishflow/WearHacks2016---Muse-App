package com.interaxon.test.libmuse;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by xcode on 16-03-25.
 */
public class DataArray {


    public Float [] eegData = new Float[4];

    //float accelerometerData;

    public DataArray()
    {

    }

    public DataArray( Float v1, Float v2, Float v3, Float v4)
    {
        eegData[0] = v1;
        eegData[1] = v2;
        eegData[2] = v3;
        eegData[3] = v4;
    }

    public void setEegData( Float v1, Float v2, Float v3, Float v4){
        eegData[0] = v1;
        eegData[1] = v2;
        eegData[2] = v3;
        eegData[3] = v4;
    }

    public Float[] getArray(){
        return eegData;
    }

}
