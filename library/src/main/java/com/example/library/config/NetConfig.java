package com.example.library.config;

public class NetConfig {
    public String hostName;
   public int readTimeOut;
    public int connectTimeOut;
    public int writeTimeOut;
    public boolean cache;

    private NetConfig(Builder builder) {
        hostName = builder.hostName;
        readTimeOut = builder.readTimeOut;
        connectTimeOut = builder.connectTimeOut;
        writeTimeOut = builder.writeTimeOut;
        cache = builder.cache;
    }


    public static final class Builder {
        private String hostName;
        private int readTimeOut;
        private int connectTimeOut;
        private int writeTimeOut;
        private boolean cache;

        public Builder() {
        }

        public Builder hostName(String val) {
            hostName = val;
            return this;
        }

        public Builder readTimeOut(int val) {
            readTimeOut = val;
            return this;
        }

        public Builder connectTimeOut(int val) {
            connectTimeOut = val;
            return this;
        }

        public Builder writeTimeOut(int val) {
            writeTimeOut = val;
            return this;
        }

        public Builder cache(boolean val) {
            cache = val;
            return this;
        }

        public NetConfig build() {
            return new NetConfig(this);
        }
    }
}
