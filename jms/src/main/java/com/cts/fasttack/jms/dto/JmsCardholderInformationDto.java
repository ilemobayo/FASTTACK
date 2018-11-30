package com.cts.fasttack.jms.dto;

/**
 * JmsCardholderInfoDto for tokenInquery
 *
 * @author Dmitry Koval
 */
public class JmsCardholderInformationDto {

    private String version;

    private String encryptionKeyIndex;

    private String encryptedData;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEncryptionKeyIndex() {
        return encryptionKeyIndex;
    }

    public void setEncryptionKeyIndex(String encryptionKeyIndex) {
        this.encryptionKeyIndex = encryptionKeyIndex;
    }

    public String getEncryptedData() {
        return encryptedData;
    }

    public void setEncryptedData(String encryptedData) {
        this.encryptedData = encryptedData;
    }
}
