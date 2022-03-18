package com.test.springboot.data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class audio {
    private String customerTransactionID;
    private String encoding;
    @Min(value = 8000, message = "sampleRateHertz should not be less than 8000")
    @Max(value = 46000, message = "sampleRateHertz should not be greater than 46000")
    private int sampleRateHertz = 16000;
    private String languageCode;
    private String audioData;

    public audio(String customerTransactionID, String encoding, int sampleRateHertz, String languageCode,
    String audioData) {
    this.customerTransactionID = customerTransactionID;
    
    if (encoding == null)
        this.encoding = "LINEAR16";
    else
        this.encoding = encoding;

    this.sampleRateHertz = sampleRateHertz;
        
    this.languageCode = languageCode;
    this.audioData = audioData;
}

    public void Set_ID(String id) {
        this.customerTransactionID = id;
    }

    public void Set_encoding(String encoding) {
        this.encoding = encoding;
    }

    public void Set_sampleRateHertz(int sampleRateHertz) throws Exception {
        this.sampleRateHertz = sampleRateHertz;
    }

    public void Set_languageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void Set_audioData(String audioData) {
        this.audioData = audioData;
    }

    public String Get_ID() {
        return customerTransactionID;
    }

    public String Get_encoding() {
        return encoding;
    }

    public int Get_sampleRateHertz() {
        return sampleRateHertz;
    }

    public String Get_languageCode() {
        return languageCode;
    }

    public String Get_audioData() {
        return audioData;
    }
}
