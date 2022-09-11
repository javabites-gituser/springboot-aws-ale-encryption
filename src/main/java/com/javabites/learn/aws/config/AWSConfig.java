package com.javabites.learn.aws.config;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AWSConfig {

    public AWSKMS createAWSKMSBean(){
         AWSKMS awskms = AWSKMSClientBuilder.standard().withCredentials(localCredentialProver()).build();
         return awskms;
    }

    private AWSCredentialsProvider localCredentialProver() {
        return new ProfileCredentialsProvider("kms-user-profile");
    }
}
