package com.mt.microservice.microservice_architecture.liceneses.controllers;

import com.mt.microservice.microservice_architecture.liceneses.models.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vl/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping(value = "/{licenseId}")
    public License getLicenses(@PathVariable int organizationId, @PathVariable int licenseId) {
        return new License.Builder()
                .id(licenseId)
                .licenseType("Telecom")
                .organizationId(organizationId)
                .productName("TestOrg")
                .licenseType("Seat").build();
    }
}
