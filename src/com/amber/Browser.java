package com.amber;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = sendHTTpAddress(ip);
        System.out.println(html);
    }

    private String sendHTTpAddress(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "127.01.01";
    }


}
