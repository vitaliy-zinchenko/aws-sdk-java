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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon S3 Location information for an input manifest file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/InputS3Object" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputS3Object implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket that contains the manifest.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name and location of the manifest file withiin the bucket.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The version ID of the bucket.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The Amazon S3 bucket that contains the manifest.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that contains the manifest.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the manifest.
     * </p>
     * 
     * @return The Amazon S3 bucket that contains the manifest.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that contains the manifest.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket that contains the manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputS3Object withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name and location of the manifest file withiin the bucket.
     * </p>
     * 
     * @param key
     *        The name and location of the manifest file withiin the bucket.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name and location of the manifest file withiin the bucket.
     * </p>
     * 
     * @return The name and location of the manifest file withiin the bucket.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name and location of the manifest file withiin the bucket.
     * </p>
     * 
     * @param key
     *        The name and location of the manifest file withiin the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputS3Object withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The version ID of the bucket.
     * </p>
     * 
     * @param versionId
     *        The version ID of the bucket.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID of the bucket.
     * </p>
     * 
     * @return The version ID of the bucket.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version ID of the bucket.
     * </p>
     * 
     * @param versionId
     *        The version ID of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputS3Object withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputS3Object == false)
            return false;
        InputS3Object other = (InputS3Object) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public InputS3Object clone() {
        try {
            return (InputS3Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.InputS3ObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
