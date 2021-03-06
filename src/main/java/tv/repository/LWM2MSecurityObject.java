package tv.repository;

import org.springframework.stereotype.Service;

/**
 * Created by Scott on 6/26/15.
 */

public class LWM2MSecurityObject {
    private String LWM2MServerURI;
    private boolean BootstrapServer;
    private int SecurityMode;
    private String KeyOrIdentity;
    private String SecretKey;
    private int ShortServerID;
    private int ClientHoldOffTime;

    public LWM2MSecurityObject() {
    }

    public LWM2MSecurityObject(String LWM2MServerURI, boolean bootstrapServer, int securityMode, String keyOrIdentity, String secretKey, int shortServerID, int clientHoldOffTime) {
        this.LWM2MServerURI = LWM2MServerURI;
        BootstrapServer = bootstrapServer;
        SecurityMode = securityMode;
        KeyOrIdentity = keyOrIdentity;
        SecretKey = secretKey;
        ShortServerID = shortServerID;
        ClientHoldOffTime = clientHoldOffTime;
    }

    public String getLWM2MServerURI() {
        return LWM2MServerURI;
    }

    public void setLWM2MServerURI(String LWM2MServerURI) {
        this.LWM2MServerURI = LWM2MServerURI;
    }

    public boolean isBootstrapServer() {
        return BootstrapServer;
    }

    public void setBootstrapServer(boolean bootstrapServer) {
        BootstrapServer = bootstrapServer;
    }

    public int getSecurityMode() {
        return SecurityMode;
    }

    public void setSecurityMode(int securityMode) {
        SecurityMode = securityMode;
    }

    public String getKeyOrIdentity() {
        return KeyOrIdentity;
    }

    public void setKeyOrIdentity(String keyOrIdentity) {
        KeyOrIdentity = keyOrIdentity;
    }

    public String getSecretKey() {
        return SecretKey;
    }

    public void setSecretKey(String secretKey) {
        SecretKey = secretKey;
    }

    public int getShortServerID() {
        return ShortServerID;
    }

    public void setShortServerID(int shortServerID) {
        ShortServerID = shortServerID;
    }

    public int getClientHoldOffTime() {
        return ClientHoldOffTime;
    }

    public void setClientHoldOffTime(int clientHoldOffTime) {
        ClientHoldOffTime = clientHoldOffTime;
    }

    @Override
    public String toString() {
        return "LWM2MSecurityObject: {" +
                "LWM2MServerURI='" + LWM2MServerURI + '\'' +
                ", BootstrapServer=" + BootstrapServer +
                ", SecurityMode=" + SecurityMode +
                ", KeyOrIdentity='" + KeyOrIdentity + '\'' +
                ", SecretKey='" + SecretKey + '\'' +
                ", ShortServerID=" + ShortServerID +
                ", ClientHoldOffTime=" + ClientHoldOffTime +
                '}';
    }
}
