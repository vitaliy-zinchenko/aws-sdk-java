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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrialRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     */
    private String experimentName;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param trialName
     *        The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @return The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param trialName
     *        The name of the trial. The name must be unique in your AWS account and is not case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *        specified, <code>TrialName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @return The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *         specified, <code>TrialName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     *        specified, <code>TrialName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to associate the trial with.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * 
     * @return The name of the experiment to associate the trial with.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment to associate the trial with.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment to associate the trial with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the trial. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrialRequest == false)
            return false;
        CreateTrialRequest other = (CreateTrialRequest) obj;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrialRequest clone() {
        return (CreateTrialRequest) super.clone();
    }

}
