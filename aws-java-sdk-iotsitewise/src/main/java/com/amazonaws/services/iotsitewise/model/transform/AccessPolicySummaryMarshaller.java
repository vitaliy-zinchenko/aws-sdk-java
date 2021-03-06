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
package com.amazonaws.services.iotsitewise.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AccessPolicySummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AccessPolicySummaryMarshaller {

    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<StructuredPojo> IDENTITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("identity").build();
    private static final MarshallingInfo<StructuredPojo> RESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resource").build();
    private static final MarshallingInfo<String> PERMISSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("permission").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTUPDATEDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdateDate").timestampFormat("unixTimestamp").build();

    private static final AccessPolicySummaryMarshaller instance = new AccessPolicySummaryMarshaller();

    public static AccessPolicySummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AccessPolicySummary accessPolicySummary, ProtocolMarshaller protocolMarshaller) {

        if (accessPolicySummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(accessPolicySummary.getId(), ID_BINDING);
            protocolMarshaller.marshall(accessPolicySummary.getIdentity(), IDENTITY_BINDING);
            protocolMarshaller.marshall(accessPolicySummary.getResource(), RESOURCE_BINDING);
            protocolMarshaller.marshall(accessPolicySummary.getPermission(), PERMISSION_BINDING);
            protocolMarshaller.marshall(accessPolicySummary.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(accessPolicySummary.getLastUpdateDate(), LASTUPDATEDATE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
