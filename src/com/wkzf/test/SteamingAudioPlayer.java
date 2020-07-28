package com.wkzf.test;

class StreamingAudioPlayer extends AudioPlayer {
    protected boolean openSpeaker(Speaker sp)
    {
        System.out.println("StreamingAudioPlayer");
        return true;
    }

    public static void main(String[] args)
    {
        StreamingAudioPlayer sap=new StreamingAudioPlayer();
        Speaker s=new Speaker();
        sap.openSpeaker(s);
    }
}

