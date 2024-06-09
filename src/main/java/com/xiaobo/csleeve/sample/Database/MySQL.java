package com.xiaobo.csleeve.sample.Database;

import com.xiaobo.csleeve.sample.IConnect;
public class MySQL implements IConnect {
    private String ip;
    private Integer port;

    public MySQL(String ip, Integer port) {
        this.ip = ip;
        this.port = port;
    }

    public MySQL() {
    }

    @Override
    public void connect() {
        System.out.println(this.ip + ":" + this.port);

    }
}
