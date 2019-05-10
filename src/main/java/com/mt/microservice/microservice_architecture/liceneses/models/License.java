package com.mt.microservice.microservice_architecture.liceneses.models;

public class License {
    private int id;
    private int organizationId;
    private String productName;
    private String licenseType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public License(Builder builder) {
        this.id = builder.id;
        this.organizationId = builder.organizationId;
        this.productName = builder.productName;
        this.licenseType = builder.licenseType;
    }

    public static class Builder {
        private int id;
        private int organizationId;
        private String productName;
        private String licenseType;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder organizationId(int organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public License build() {
            return new License(this);
        }
    }
}
