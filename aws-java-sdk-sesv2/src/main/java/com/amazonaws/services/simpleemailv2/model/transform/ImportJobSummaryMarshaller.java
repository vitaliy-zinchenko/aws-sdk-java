/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemailv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleemailv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImportJobSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImportJobSummaryMarshaller {

    private static final MarshallingInfo<String> JOBID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobId").build();
    private static final MarshallingInfo<StructuredPojo> IMPORTDESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImportDestination").build();
    private static final MarshallingInfo<String> JOBSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("JobStatus").build();
    private static final MarshallingInfo<java.util.Date> CREATEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedTimestamp").timestampFormat("unixTimestamp").build();

    private static final ImportJobSummaryMarshaller instance = new ImportJobSummaryMarshaller();

    public static ImportJobSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImportJobSummary importJobSummary, ProtocolMarshaller protocolMarshaller) {

        if (importJobSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(importJobSummary.getJobId(), JOBID_BINDING);
            protocolMarshaller.marshall(importJobSummary.getImportDestination(), IMPORTDESTINATION_BINDING);
            protocolMarshaller.marshall(importJobSummary.getJobStatus(), JOBSTATUS_BINDING);
            protocolMarshaller.marshall(importJobSummary.getCreatedTimestamp(), CREATEDTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
